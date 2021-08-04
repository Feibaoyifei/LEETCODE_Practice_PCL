package com.pcl.leetcode.easy;

public class TradeStock {
    /*
    //卖出股票的最佳时机
     */
    public int maxProfit(int[] prices){
        int min=prices[0],max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-min>max)
                max=prices[i]-min;
            if(min>prices[i]){
                min=prices[i];
            }

        }
        return max;

    }
}
