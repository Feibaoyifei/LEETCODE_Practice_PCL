package com.pcl.leetcode.easy;

public class SymmetryTree {
    class TreeNode {
        int val;
    TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
    }


    /*
    * 此题思考了好几天，归根到底还是递归的点没有找对，过了几天之后迷迷糊糊写出来了，但还是感觉没有get到精髓，仍旧迷迷糊糊*/
    boolean isMarroi(TreeNode p,TreeNode q){
        if(p==null&&q==null)
            return true;
        else if(p==null||q==null)
            return false;
        else if(p.val==q.val) return isMarroi(p.left,q.right)&&isMarroi(p.right,q.left);
        else return false;


    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return isMarroi(root.left,root.right);





    }
}
