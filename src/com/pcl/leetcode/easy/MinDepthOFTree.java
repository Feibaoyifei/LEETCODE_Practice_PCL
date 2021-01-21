package com.pcl.leetcode.easy;

public class MinDepthOFTree {
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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.right!=null&&root.left!=null)
            return Math.min(minDepth(root.left),minDepth(root.right))+1;
        else if(root.left==null)
            return minDepth(root.right)+1;
        else return minDepth(root.left)+1;


    }

}
