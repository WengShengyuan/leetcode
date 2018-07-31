package org.wsy.leetcode.array;

import java.util.List;
import java.lang.Character;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 * 有效的数独
 * 
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * 1.数字 1-9 在每一行只能出现一次。
 * 2.数字 1-9 在每一列只能出现一次。
 * 3.数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/30/
 */
public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        // line
        for(char[] line:board) {
            List<Character> lineList = new LinkedList<Character>();
            for(Character c: line) {
                if('.' != c) {
                    lineList.add(c);
                }
            }
            if(!isLineAllow(lineList)) {
                return false;
            }
        }

        // column
        for(int i=0;i<9;i++) {
            List<Character> lineList = new LinkedList<Character>();
            for(char[] line: board) {
                if('.' != line[i]) {
                    lineList.add(line[i]);
                }
            }
            if(!isLineAllow(lineList)) {
                return false;
            }
        }

        // square
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                List<Character> lineList = new LinkedList<Character>();
                for(int r=0;r<3;r++) {
                    for(int c=0;c<3;c++) {
                        if('.' != board[i*3+r][j*3+c]) {
                            lineList.add(board[i*3+r][j*3+c]);
                        }
                    }
                }
                if(!isLineAllow(lineList)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isLineAllow(List<Character> line) {
        List<Character> checkList = new ArrayList<Character>();
        for(Character c: line) {
            if(checkList.contains(c)) {
                for(Character cc: line) {
                    System.out.print(cc+" ");
                }
                return false;
            } else {
                checkList.add(c);
            }
        }
        return true;
    }
}