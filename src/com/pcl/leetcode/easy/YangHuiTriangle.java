package com.pcl.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class YangHuiTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res=new LinkedList<>();
        List<Integer> temp;
        int[][] a=new int[numRows][numRows];
        for(int i=0;i<numRows;i++){
            temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    a[i][j]=1;

                }
                else a[i][j]=a[i-1][j-1]+a[i-1][j];
                temp.add(a[i][j]);
            }
            res.add(temp);
        }
return res;


    }

    //给定行号，返回该行，如给数字3，则返回（1，3，3，1）
    public List<Integer> getRow(int numRows) {
        numRows+=1;
        List<List<Integer>> res=new LinkedList<>();
        List<Integer> temp;
        int[][] a=new int[numRows][numRows];
        for(int i=0;i<numRows;i++){
            temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    a[i][j]=1;

                }
                else a[i][j]=a[i-1][j-1]+a[i-1][j];
                temp.add(a[i][j]);
            }
            res.add(temp);
        }
        return res.get(numRows);

    }


}
