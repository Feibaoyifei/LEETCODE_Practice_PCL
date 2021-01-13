package com.pcl.leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /* 此法取巧
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);*/

        //正经做法
        int i=m-1,j=n-1,h=m+n-1;
        while (i>=0&&j>=0){
            if(nums1[i]>nums2[j])
                nums1[h--]=nums1[i--];
            else nums1[h--]=nums2[j--];
        }
        if(i<0)
            while (j>=0){
                nums1[h--]=nums2[j--];
            }
        //因为数组是有序的，如果num2数组为空了之后，num1的剩余部分已经是有序的，因此不需要在做这个else操作
        //而如果num1数组先空了之后，需要把num2的剩余部分复制到num1,即if部分的操作
        /*else while (i>=0){
            nums1[h--]=nums1[i--];
        }*/



    }
}
