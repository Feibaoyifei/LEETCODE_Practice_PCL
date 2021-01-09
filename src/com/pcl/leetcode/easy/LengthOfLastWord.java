package com.pcl.leetcode.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        /**此方法效率较慢
        String[] str=s.split("\\s+ ");
        int n=str.length;
        if(n==0) return 0;
        else
        return str[n-1].length();*/

        //此方法效率高，直接从字符串末尾数数出来最后一个单词的长度
        int length=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.indexOf(i)!=' ')
                length++;
            else if(length!=0)
                return length;
        }

return length;
    }
}
