package org.wsy.leetcode.array;
import java.util.List;
import java.util.LinkedList;
import java.lang.Integer;
/**
 * 移动零
 * 
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/28/
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        List<Integer> list = new LinkedList<Integer>();
        for(int num: nums) {
            if(num != 0) {
                list.add(num);
            }
        }
        int length = nums.length;
        int size = list.size();
        for(int i=0;i< length;i++) {
            if(i < size) {
                nums[i] = list.get(i);
            } else {
                nums[i] = 0;
            }
        }
        
    }
}