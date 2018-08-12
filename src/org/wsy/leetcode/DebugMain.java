package org.wsy.leetcode;

public class DebugMain {
    public static void main(String[] args) {
        long current = System.currentTimeMillis();
        debugSetZeros();
        System.out.println("执行时间: " + (System.currentTimeMillis() - current) + " ms");
    }

    static void debugSetZeros() {
        org.wsy.leetcode.array.SetZeros setZeros = new org.wsy.leetcode.array.SetZeros();
        setZeros.setZeroes(new int[][] {
                {0,1,2,0},
                {3,4,5,3},
                {1,3,1,5}
        });
    }

//    static void debugThreeSum() {
//        org.wsy.leetcode.array.ThreeSum threeSum = new org.wsy.leetcode.array.ThreeSum();
//        threeSum.threeSum(new int[]{-2,0,0,2,2});
//    }


//    static void debugPascTriangle() {
//        org.wsy.leetcode.other.PascTriangle pascTriangle = new org.wsy.leetcode.other.PascTriangle();
//        pascTriangle.generate(5);
//    }

//    static void debugHammingWeight() {
//        org.wsy.leetcode.other.HammingWeight hammingWeight = new org.wsy.leetcode.other.HammingWeight();
//        System.out.println(hammingWeight.hammingWeight(  4294967295l));
//    }

//    static void debugRob() {
//        org.wsy.leetcode.dp.Rob rob = new org.wsy.leetcode.dp.Rob();
//        System.out.println(rob.rob(new int[] {1,2,3,1}));
//    }

//    static void debugMaxSubArray() {
//        org.wsy.leetcode.dp.MaxSubArray maxSubArray = new org.wsy.leetcode.dp.MaxSubArray();
//        System.out.println(maxSubArray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
//    }

//    static void debugClimbStairs() {
//        org.wsy.leetcode.dp.ClimbStairs climbStairs = new org.wsy.leetcode.dp.ClimbStairs();
//        System.out.println(climbStairs.climbStairs(5));
//    }

//    static void debugFirstBadVersion() {
//        org.wsy.leetcode.sort.FirstBadVersion firstBadVersion = new org.wsy.leetcode.sort.FirstBadVersion();
//        System.out.println(firstBadVersion.firstBadVersion(3));
//    }

//    static void debugMerge() {
//        org.wsy.leetcode.sort.Merge merge = new org.wsy.leetcode.sort.Merge();
//        merge.merge(new int[]{1, 2, 3, 0, 0, 0}, 6, new int[]{2, 5, 6}, 3);
//    }

//    static void debugSortedArrayToBST() {
//        org.wsy.leetcode.tree.SortedArrayToBST sortedArrayToBST = new org.wsy.leetcode.tree.SortedArrayToBST();
//        System.out.println(sortedArrayToBST.sortedArrayToBST(new int[] {-10,-3,0,5,9}));
//    }

//    static void debugLevelOrder() {
//        org.wsy.leetcode.tree.LevelOrder levelOrder = new org.wsy.leetcode.tree.LevelOrder();
//        System.out.println(levelOrder.levelOrder(new TreeNode(3,
//                new TreeNode(9),new TreeNode(20,
//                new TreeNode(15), new TreeNode(7)))));
//    }

//    static void debugIsSymmetric() {
//        org.wsy.leetcode.tree.IsSymmetric isSymmetric = new org.wsy.leetcode.tree.IsSymmetric();
//        System.out.println(isSymmetric.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)).trimRight(),
//                new TreeNode(2, new TreeNode(4), new TreeNode(3)).trimLeft())));
//    }

//    static void debugIsValidBST() {
//        org.wsy.leetcode.tree.IsValidBST isValidBST = new org.wsy.leetcode.tree.IsValidBST();
//        System.out.println(isValidBST.isValidBST(new TreeNode(2,new TreeNode(1), new TreeNode(3))));
//        System.out.println(isValidBST.isValidBST(new TreeNode(5,new TreeNode(1), new TreeNode(4,new TreeNode(3),new TreeNode(6)))));
//    }

//    static void debugMaxDepth() {
//        org.wsy.leetcode.tree.MaxDepth maxDepth = new org.wsy.leetcode.tree.MaxDepth();
//        System.out.println(maxDepth.maxDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
//    }

//    static void debugHasCycle() {
//        org.wsy.leetcode.list.HasCycle hasCycle = new org.wsy.leetcode.list.HasCycle();
//        System.out.println(hasCycle.hasCycle(NodeFactory.build(new int[]{1, 2, 3, 2, 1})));
//    }

//    static void debugIsPalindrome() {
//        org.wsy.leetcode.list.IsPalindrome isPalindrome = new org.wsy.leetcode.list.IsPalindrome();
//        System.out.println(isPalindrome.isPalindrome(NodeFactory.build(new int[]{1,0,1})));
//    }

//    static void debugMergeTwoLists() {
//        org.wsy.leetcode.list.MergeTwoLists mergeTwoLists = new org.wsy.leetcode.list.MergeTwoLists();
//        System.out.println(mergeTwoLists.mergeTwoLists(NodeFactory.build(new int[]{2}), NodeFactory.build(new int[]{1})));
//    }

//    static void debugReverseList() {
//        org.wsy.leetcode.list.ReverseList reverseList = new org.wsy.leetcode.list.ReverseList();
//        System.out.println(reverseList.reverseList(NodeFactory.build(new int[]{1,2,3,4,5})));
//    }

//    static void debugRemoveNthFromEnd() {
//        org.wsy.leetcode.list.RemoveNthFromEnd removeNthFromEnd = new org.wsy.leetcode.list.RemoveNthFromEnd();
//        System.out.println(removeNthFromEnd.removeNthFromEnd(NodeFactory.build(new int[]{1,2,3,4,5}),2));
//    }

//    static void debugDeleteNode() {
//        org.wsy.leetcode.list.DeleteNode deleteNode = new org.wsy.leetcode.list.DeleteNode();
//        ListNode listNode4 = new ListNode(4);
//        ListNode listNode5 = new ListNode(5);
//        ListNode listNode1 = new ListNode(1);
//        ListNode listNode9 = new ListNode(9);
//        listNode4.setNext(listNode5);
//        listNode5.setNext(listNode1);
//        listNode1.setNext(listNode9);
//
//        System.out.println(listNode4);
//        deleteNode.deleteNode(listNode4,5);
//        System.out.println(listNode4);
//
//    }

//    static void debugLongestCommonPrefix() {
//        org.wsy.leetcode.string.LongestCommonPrefix longestCommonPrefix = new org.wsy.leetcode.string.LongestCommonPrefix();
//        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[] {"c","c"}));
//    }

//    static void debugCountAndSay() {
//        org.wsy.leetcode.string.CountAndSay countAndSay = new org.wsy.leetcode.string.CountAndSay();
//        System.out.println(countAndSay.countAndSay(5));
//    }

//    static void debugStrStr() {
//        org.wsy.leetcode.string.StrStr strStr = new org.wsy.leetcode.string.StrStr();
//        System.out.println(strStr.strStr("mississippi",
//                "issipi"));
//    }
}
