package com.pcl.leetcode.easy;

public class Str {
    public int strStr(String haystack, String needle) {
        if(needle==null)
            return 0;
        else  return haystack.indexOf(needle);

    }
}
