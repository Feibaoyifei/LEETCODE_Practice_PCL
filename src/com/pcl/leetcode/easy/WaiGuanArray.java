package com.pcl.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class WaiGuanArray {
    public String say(String str){
        int len=str.length();
        char[] ch=str.toCharArray();

        char[][] arr=new char[30][2];//此处应设置char[10000][2],起初设置为[30][2]报错数组越界。后改为100，1000，直到一万
        StringBuilder sb=new StringBuilder();
        arr[0][0]=ch[0];
        arr[0][1]='1';
        int top=0;
        for(int i=1;i<len;i++){
            if(ch[i]==arr[top][0])
                arr[top][1]++;
            else {
                arr[++top][0]=ch[i];
                arr[top][1]='1';
            }

        }

        for(int i=0;i<=top;i++){
            sb.append(arr[i][1]).append(arr[i][0]);

        }




        return sb.toString();
    }


      public String countAndSay(int n) {

              if(n==1)
                  return "1";
              else  return  say(countAndSay(n-1));




          }




}
/** 大佬答案，效率比自己写的提升若干倍
 * class Solution {
 *     public String countAndSay(int n) {
 *         if(n == 1) return "1";
 *         String num = countAndSay(n - 1);
 *         StringBuilder s = new StringBuilder();
 *         for(int i=0; i<num.length(); i++) {
 *             int count = 1;
 *             while(i < num.length()-1 && num.charAt(i) == num.charAt(i+1)) {
 *                 count++;
 *                 i++;
 *             }
 *             s.append(count);
 *             s.append(num.charAt(i));
 *         }
 *         return s.toString();
 *     }
 * }
 */
