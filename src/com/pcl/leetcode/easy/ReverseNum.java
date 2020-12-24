package com.pcl.leetcode.easy;
//数字反转
public class ReverseNum {
    public int reverse(int x){

        long a=0;
        if (x>0)
            a= rev_abs(x);
        else if (x<0)
            a= -rev_abs(-x);
        if (a>Integer.MAX_VALUE||a<Integer.MIN_VALUE)
            return 0;
        else
        return (int)a;
    }
    long rev_abs(long a){
       long[] arr =new long[32];
       long sum=0;
       int i ;
       for (i=0;a!=0;a/=10,i++){

           arr[i]=a%10;
       }
       int length=--i;
       for (int j=0;j<=length;j++,i--){
           sum+=arr[j]*Math.pow(10,i);
       }
       return sum;

    }
}
