package com.pcl.leetcode.easy;

public class LongestCommonpre {
    public String longestCommonPrefix(String[] strs){

        int leng=strs.length;
        if(leng==0)
            return "";
        int min_len=Integer.MAX_VALUE; //最短字符串的长度
        int min_flag=0;
        for( int i =0;i<leng;i++){
            if(min_len>strs[i].length()){


                min_len=strs[i].length();
                min_flag=i;
        }}

        String res="";
        //int j;//表示string数组的下标
        int i; //表示string数组中每个string元素的下标
        for(i=0;i<strs[min_flag].length();i++) {
            boolean flag=false;
            for (int j = 1; j < leng; j++) {
                if (strs[j].charAt(i) != strs[j - 1].charAt(i)){
                    flag=true;
                    break;
                }


            }
            if(flag) {
                //res =strs[0].substring(0,i);
                break;
            }
            else //res=strs[min_flag];//res加上当前字符
           res= res+strs[0].charAt(i);

        }
        return res;
        }
    }

