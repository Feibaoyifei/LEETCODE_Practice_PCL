package com.pcl.leetcode.easy;

public class TradeStock {
    /*
    //卖出股票的最佳时机i
     */
  /*  public int maxProfit(int[] prices){
        int min=prices[0],max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-min>max)
                max=prices[i]-min;
            if(min>prices[i]){
                min=prices[i];
            }

        }
        return max;

    }*/
    //卖出股票的最佳时机ii
    public int maxProfit(int[] prices){
        int max=0;
        for (int i=1;i<prices.length;i++){
            if (prices[i]>prices[i-1]){
                max+=prices[i]-prices[i-1];
            }
        }
        return max;

    }


}
