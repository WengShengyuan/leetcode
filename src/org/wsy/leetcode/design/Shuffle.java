package org.wsy.leetcode.design;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Shuffle an Array
 *
 * 打乱一个没有重复元素的数组。
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/24/design/58/
 *
 */
public class Shuffle {
    int[] input = null;
    int[] original = null;
    public Shuffle(int[] nums) {
        input = nums;
        original = nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        input = original.clone();
        return input;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> indexList = new LinkedList<Integer>();
        Random random = new Random();
        while(indexList.size() < input.length) {
            int index = random.nextInt(original.length);
            if(!indexList.contains(index)) {
                indexList.add(index);
            }
        }
        int[] shuffled = new int[input.length];
        int s = 0;
        for(int index: indexList) {
            shuffled[s++] = input[index];
        }
        return shuffled;
    }


}
