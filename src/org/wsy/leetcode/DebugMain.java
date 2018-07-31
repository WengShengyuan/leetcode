package org.wsy.leetcode;

import org.wsy.leetcode.string.StrStr;

public class DebugMain {
    public static void main(String[] args) {
        long current = System.currentTimeMillis();

        debugStrStr();

        System.out.println("执行时间: " + (System.currentTimeMillis() - current) + " ms");
    }

    public static void debugStrStr() {
        StrStr strStr = new StrStr();
        strStr.strStr("hello","ll");
    }
}
