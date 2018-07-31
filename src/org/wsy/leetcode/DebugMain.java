package org.wsy.leetcode;

public class DebugMain {
    public static void main(String[] args) {
        long current = System.currentTimeMillis();

        debugStrStr();

        System.out.println("执行时间: " + (System.currentTimeMillis() - current) + " ms");
    }

    static void debugStrStr() {
        org.wsy.leetcode.string.StrStr strStr = new org.wsy.leetcode.string.StrStr();
        System.out.println(strStr.strStr("mississippi",
                "issipi"));
    }
}
