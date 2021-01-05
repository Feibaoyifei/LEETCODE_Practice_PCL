package com.pcl.leetcode.easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
       int len=nums.length,j=len-1;
       if(len==0)
           return 0;
        for(int i=0;i<j;i++){
            if(nums[i]==val){
                while (nums[j]==val&&j>i) {
                    j--;
                }
                if(j==i)
                    break;
                else
                nums[i]=nums[j--];
            }
        }
        if(nums[j]==val)
            return j;
        else  return j+1;

    }
}
/**本题的思路主要是从前往后遍历，如果遇到数值等于val的元素，就从后往前找到一个不等于val的数值进行填充
 * 其中 i 为从前往后遍历的下标，j为从后往前遍历的下标
 * 每次当nums[i]==val时，就找到一个不等于val的num[j]进行替换，当i=j时停止循环
 *
 * 此时根据j的值进行判断，如果num【j]==val时，那么数组的长度就是j,如果nums[j]!=val时，那么数组长度就是j+1
 * * */