package com.pcl.leetcode.easy;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BinaryTreeLevelOrderII {
    class TreeNode {
        int val;
        TreeNode left;
       TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res=new LinkedList<>();
        if(root==null)
            return res;


        TreeNode[] queue=new TreeNode[10000];
        queue[0]=root;
        int front=-1,rear=0,end=0;
        LinkedList<Integer> temp=new LinkedList<>();
        while (front!=end){

            TreeNode node=queue[++front];
            System.out.println(node.val);
            temp.add(node.val);
            System.out.println(node.val+"入队");
            if(node.left!=null)
                queue[++end]=node.left;
            if(node.right!=null)
                queue[++end]=node.right;
            if(front==rear){
                rear=end;
                //System.out.println(temp);
                res.addFirst(temp);
                temp=new LinkedList<>(); //此处刚开始写的是temp.clear，误以为temp的值会装填到res中，然后将temp清空，
                // 但是最后结果输出的永远都是空list,后来改为文中这种，即正确了，由此可见，对一个list进行add是将变量的引用传过去，
                //而不是将该变量的值复制到list之中

            }



        }
        return res;


    }

}
