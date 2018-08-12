package org.wsy.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 矩阵置0
 *
 * 给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/29/array-and-strings/76/
 */
public class SetZeros {

    public void setZeroes(int[][] matrix) {
        List<Integer> xs = new ArrayList<Integer>();
        List<Integer> ys = new ArrayList<Integer>();
        for(int i=0;i < matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(matrix[i][j] == 0) {
                    if(!xs.contains(i)) {
                        xs.add(i);
                    }
                    if(!ys.contains(j)) {
                        ys.add(j);
                    }
                }
            }
        }
        for(int i=0;i < matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(xs.contains(i) || ys.contains(j)) {
                    matrix[i][j]=0;
                }
            }
        }
    }

}
