package com.pcl.leetcode.easy;
//最大子序列和
/**暴力求解
 * 列出所有可能的子序列，从长度为一，到长度为array。length，求出最大的一个
 *
 * 提交时运行超时
 *


public class MaxSumofSubseq {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE; //最后的返回值
        for(int i=1;i<=nums.length;i++){   //控制子序列长度

            for(int j=0;j+i<nums.length+1;j++){ //计算长度为i的子序列的最大和
                int tem_max_sum=0;
                for(int h=j;h<j+i;h++){
                    tem_max_sum+=nums[h];
                }
                if(tem_max_sum>sum)
                    sum=tem_max_sum;
            }


        }

    return sum;
    }
}
*/
public class MaxSumofSubseq {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int[] arr=new int[n];
        arr[0]=nums[0];
        int res=nums[0];
        for(int i=1;i<n;i++){
            if(arr[i-1]<0)
                arr[i]=nums[i];
            else arr[i]=arr[i-1]+nums[i];
            res=Math.max(res,arr[i]);

        }
        return res;

    }
}