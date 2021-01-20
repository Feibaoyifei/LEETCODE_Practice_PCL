package com.pcl.leetcode.easy;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaxDepthOfBinaryTree {
    /*递归方式
    public int maxDepth(TreeNode root) {

        if(root==null)
            return 0;
        else return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }*/


    /* 层序遍历方法
    public int maxDepth(TreeNode root){
        if(root==null)
            return 0;
        TreeNode[] queue=new TreeNode[10000];
        int height=0;
        queue[0]=root;
        int front=-1,end=0,tail=0;

        while (front!=tail){
            TreeNode temp=queue[++front];
            if(temp.left!=null)
                queue[++tail]=temp.left;
            if(temp.right!=null)
                queue[++tail]=temp.right;
            if(front==end){
                height++;
                end=tail;
            }
        }

       return height;

    }*/


}
