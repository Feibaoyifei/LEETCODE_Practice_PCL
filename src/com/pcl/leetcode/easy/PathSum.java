package com.pcl.leetcode.easy;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){

            return false;
        }

        if((root.val==targetSum)&&(root.left==null)&&(root.right==null)){
            return true;
        }

        if((root.val!=targetSum)&&(root.left==null)&&(root.right==null)){

            return false;
        }



        return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);

    }
}
