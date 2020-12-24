package com.pcl.leetcode.easy;

public class twoNum {
    int[] res = new int[2];

    int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }

            }

        }
        return res;
    }

}
