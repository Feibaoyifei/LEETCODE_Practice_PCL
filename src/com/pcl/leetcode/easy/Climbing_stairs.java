package com.pcl.leetcode.easy;

/*第n个台阶只能从第n-1或者n-2个上来。到第n-1个台阶的走法 + 第n-2个台阶的走法 = 到第n个台阶的走法，
        已经知道了第1个和第2个台阶的走法，一路加上去*/
public class Climbing_stairs {
    public int climbStairs(int n) {
        if(n<=2)
            return n;
        int a=1,b=2,res=0;
        for(int i=3;i<=n;i++){
            res=a+b;
            a=b;
            b=res;
        }
return res;

    }
}
