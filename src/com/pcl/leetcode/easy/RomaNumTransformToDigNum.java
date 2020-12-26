package com.pcl.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomaNumTransformToDigNum {

    public int romanToInt(String s){
        int sum=0;
        int len=s.length();
        int[] num=new int[len];
        for(int i=0;i<len;i++){
            switch (s.charAt(i)){
                case 'I':
                    num[i]=1;
                    break;
                case 'V':
                    num[i]=5;
                    break;
                case 'X':
                    num[i]=10;
                    break;
                case 'L':
                    num[i]=50;
                    break;
                case 'C':
                    num[i]=100;
                    break;
                case 'D':
                    num[i]=500;
                    break;
                case 'M':
                    num[i]=1000;
            }

        }
        for(int j=len-1;j>=0;j--){
            if(j-1>=0&&num[j]>num[j-1]){
                sum+=num[j]-num[j-1];
                j--;

            }
            else  sum+=num[j];
        }
        return sum;
    }

}
