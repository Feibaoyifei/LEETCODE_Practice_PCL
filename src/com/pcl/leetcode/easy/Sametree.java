package com.pcl.leetcode.easy;

public class Sametree {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        //在leetcode提交时会报错，但是如果改成if((p!=null&&q==null)||(p==null&&q!=null)||(p.val!=q.val))则可以pass,
        // 不知道是不是leetcode的bug
        if((p.val!=q.val)||(p!=null&&q==null)||(p==null&&q!=null))
            return false;
        else return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);

    }
}
