package com.pcl.leetcode.easy;
//删除数组中的重复元素，并返回数组元素个数
public class DelRepeatedNumOnArray {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int i=1;
        while (i<nums.length){
            if(nums[i]!=nums[j]){
                nums[++j]=nums[i++];
            }
            else {
                i++;
                
            }
        }

    return j+1;
    }
}
