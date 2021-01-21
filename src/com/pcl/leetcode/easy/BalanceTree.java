package com.pcl.leetcode.easy;

public class BalanceTree {

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


    public boolean isBalanced(TreeNode root) {
           if(root==null)
               return true;
           if(height(root.left)-height(root.right)>1||height(root.left)-height(root.right)<-1)
               return false;
           return isBalanced(root.left)&&isBalanced(root.right);


    }
    int height(TreeNode t){
           if(t==null)
               return 0;
           else return Math.max(height(t.left),height(t.right))+1;

    }

}
