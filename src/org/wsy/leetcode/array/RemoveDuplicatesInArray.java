package org.wsy.leetcode.array;

/**
 * 从排序数组中删除重复项
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 用例:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 
 * https://leetcode-cn.com/submissions/detail/4825181/
 */
public class RemoveDuplicatesInArray {
    public int removeDuplicates(int[] nums) {

        if(nums == null || nums.length == 0) {
            // 空
            return 0;
        } else {
            // 非空
            int length = nums.length; // 原长度
            int startIndex = 1; // 开始检测的index
            while(startIndex < length) {
                if(nums[startIndex] == nums[startIndex - 1]) {
                    // 和左边一位相等: 左移, length-1
                    System.out.println("nums["+startIndex+"] 与 nums["+(startIndex -1)+"] 相等, 左移");
                    printArray(nums);
                    move(nums, startIndex);
                    length = length - 1;
                } else {
                    // 和左边一位不想等: startIndex + 1
                    System.out.println("nums["+startIndex+"] 与 nums["+(startIndex -1)+"] 不相等, startIndex右移");
                    startIndex = startIndex + 1;
                    printArray(nums);
                }
            }
            return length;
        }
        
    }

    /**
     * 从index处全部左移(nums[i-1] = nums[i])
     */
    private void move(int[] nums, int index) {
        for(int i=index; i < nums.length; i++) {
            nums[i-1] = nums[i];
        }
    }
    private void printArray(int[] nums) {
        for(int num: nums) {
            System.out.print(num);
        }
        System.out.println("");
    }
}

