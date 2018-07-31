package org.wsy.leetcode;

public class DebugMain {
    public static void main(String[] args) {
        long current = System.currentTimeMillis();

        debugCountAndSay();

        System.out.println("执行时间: " + (System.currentTimeMillis() - current) + " ms");
    }

    static void debugCountAndSay() {
        org.wsy.leetcode.string.CountAndSay countAndSay = new org.wsy.leetcode.string.CountAndSay();
        System.out.println(countAndSay.countAndSay(5));
    }

//    static void debugStrStr() {
//        org.wsy.leetcode.string.StrStr strStr = new org.wsy.leetcode.string.StrStr();
//        System.out.println(strStr.strStr("mississippi",
//                "issipi"));
//    }
}
