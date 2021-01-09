package com.pcl.leetcode.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        String[] str=s.split("\\s+ ");
        int n=str.length;
        if(n==0) return 0;
        else
        return str[n-1].length();


    }
}
