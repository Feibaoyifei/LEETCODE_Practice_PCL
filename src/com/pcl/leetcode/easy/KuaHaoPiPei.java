package com.pcl.leetcode.easy;

import java.util.Stack;
/*
/思路整理如下：
1.先将输入字符串转化为数组
2.以变量i为下标遍历该数组，
    if 该元素是（【{，
        then 入栈
    else 则该元素肯定是）】}，则必然要与栈内元素做匹配，又可分为两种情况
         （1）栈为空，则必定匹配失败，直接返回false
         （2）栈不空，则弹出，如果不匹配则返回 false
    然后 i++，进行下一轮循环，直到数组末尾

 */
public class KuaHaoPiPei {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        int len = ch.length;
        int i = 0;
        if (len == 0)
            return true;
        Stack<Character> st = new Stack<>();
        while (i<len){
            if(ch[i]=='('||ch[i]=='['||ch[i]=='{'){
                st.push(ch[i]);
            }
            else {
                if(!st.isEmpty()){
                    char p=st.pop();
                    if(!(ch[i]==')'&&p=='('||ch[i]==']'&&p=='['||ch[i]=='}'&&p=='{'))
                        return false;
                }
                else return false;
            }
            i++;
        }
        if(!st.isEmpty())
            return  false;
        else return true;




    }
}
