package org.wsy.leetcode.other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 帕斯卡三角
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/26/others/67/
 */
public class PascTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (numRows == 0) {
            return result;
        }

        for (int i = 0; i < numRows; i++) {
            int curLevelLength = i + 1;
            List<Integer> currentLevel = new LinkedList<Integer>();
            if (i == 0) {
                currentLevel.add(1);
                result.add(currentLevel);
            } else if (i == 1) {
                currentLevel.add(1);
                currentLevel.add(1);
                result.add(currentLevel);
            } else {
                List<Integer> upperLevel = result.get(i - 1);
                int upperLevelLength = i;
                currentLevel.add(1);
                for(int j=0;j<upperLevelLength-1;j++) {
                    currentLevel.add(upperLevel.get(j)+ upperLevel.get(j+1));
                }
                currentLevel.add(1);
                result.add(currentLevel);
            }
        }

        return result;

    }

}
