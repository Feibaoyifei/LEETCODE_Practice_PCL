package com.pcl.leetcode.easy;

public class HuiwenNum {
    public boolean isPalindrome(int x){
        if(x<0)
            return false;
        else {
            char[] s= Integer.toString(x).toCharArray();
            for(int i=0;i<s.length-1-i;i++){
                if(s[i]!=s[s.length-i-1])
                    return false;
            }

        }
        return true;
    }
}
