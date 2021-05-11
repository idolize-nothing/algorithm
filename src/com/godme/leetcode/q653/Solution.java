package com.godme.leetcode.q653;


import java.util.HashSet;
import java.util.Set;

class Solution {

    Set<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        if(set.contains(root.val)) return true;
        set.add(k - root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
