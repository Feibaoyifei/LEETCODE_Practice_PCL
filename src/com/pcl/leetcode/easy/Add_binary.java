package com.pcl.leetcode.easy;
public class Add_binary {
    public String addBinary(String a, String b) {

        String a_new="0"+a;
        String b_new="0"+b;
        char[] l,s;
        if(a.length()>b.length()){
            l=a_new.toCharArray();
            s=b_new.toCharArray();
        }else{
            l=b_new.toCharArray();
            s=a_new.toCharArray();
        }
        int i=l.length-1,j=s.length-1;
        while (j>0){
           if(s[j]=='1'){
               l[i]++;

           }
            if(l[i]=='2'){
                l[i]='0';
                l[i-1]++;

            } else if(l[i]=='3'){
                l[i]='1';
                l[i-1]++;
            }
           j--;
           i--;



        }
        while (l[i]=='2'&&i>0){
            l[i]='0';
            l[--i]++;
        }

        if(l[0]=='1')
            return new String(l);
        else return  new String(l).substring(1,l.length);

    }
}
