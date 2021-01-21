package com.pcl.leetcode.easy;

public class ArrayToBinarySearchTree {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        int len=nums.length;

        if(len==0){
            return null;
        }
        int low=0,high=len-1,mid=(low+high)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=creatTree(nums,low,mid-1);
        root.right=creatTree(nums,mid+1,high);
        return root;

    }

    private TreeNode creatTree(int[] nums, int low, int high) {
        if(low>high) return null;

            int mid=(high+low)/2;
           TreeNode temp =new TreeNode(nums[mid]);
            temp.left=creatTree(nums,low,mid-1);
            temp.right=creatTree(nums,mid+1,high);

        return temp;

    }

}
