package org.wsy.leetcode.array;
/**
 * 旋转图像
 * 
 * 给定一个 n × n 的二维矩阵表示一个图像。 将图像顺时针旋转 90 度。
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/31/
 * 
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] mark = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mark[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swapRound(i, j, n, matrix,mark);
            }
        }
    }

    /**
     * 起始(i,j) 长度n
     */
    private void swapRound(int i, int j, int n, int[][] matrix,int[][] mark) {
        if(mark[i][j] > 0){
            return;
        } else {
            int temp = matrix[i][j];
            for (int t = 0; t < 4; t++) {
                int nextI = j;
                int nextJ = n - i - 1;
                int temp2 = matrix[nextI][nextJ];
                System.out.println(i +", "+j+" -> "+nextI+", "+nextJ);
                if(t == 3) {
                    System.out.println(temp);
                    matrix[nextI][nextJ] = temp;
                } else {
                    matrix[nextI][nextJ] = temp;
                    temp = temp2;
                }
                mark[i][j] = 1;
                mark[nextI][nextJ] = 1;
                i = nextI;
                j = nextJ;
            }
        }
    }
}