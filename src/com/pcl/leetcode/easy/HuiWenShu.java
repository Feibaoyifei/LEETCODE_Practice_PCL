package com.pcl.leetcode.easy;

import java.util.Locale;

/**
 * 先将字符串转化为统一小写数组
 */
public class HuiWenShu {
    public boolean isPalindrome(String s) {

        int i=0,j=s.length()-1;
        char[] c =new char[j];
         c =s.toLowerCase().toCharArray();

        while(i<j){
            while ((c[i]>'z'||c[i]<'a')&&(c[i]>'9'||c[i]<'0')){
                //System.out.println(s.charAt(i));
                i++;
                if(i>j)
                return  true;}
            while ((c[j]>'z'||c[j]<'a')&&(c[j]>'9'||c[j]<'0')){
                //System.out.println(s.charAt(i));
                j--;
                if(j<i)
                return true;}
            if(c[i]!=c[j])
                return false;
            i++;
            j--;

        }
        return true;

    }
}
