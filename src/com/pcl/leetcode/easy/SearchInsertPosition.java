package com.pcl.leetcode.easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int low=0,high=nums.length-1;

        while(low<=high){
            int middle=(low+high)/2;
            if(target==nums[middle])
                return middle;
            else if(middle>target)
                high=middle-1;
            else low=middle+1;
        }
        return low;

    }
}
