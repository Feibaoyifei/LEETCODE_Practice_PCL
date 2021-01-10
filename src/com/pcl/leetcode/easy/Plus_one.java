package com.pcl.leetcode.easy;
/*
/直接利用数组，首先数组最后一位加一，然后循环判断数组的每一位是否为10，如果是的话就将该位置为0 并且前一位进位加一，
需要注意的是如果数组的最高位仍需进位的话就只能申请一个新的长度为原数组长度加一的数组，然后将新数组最高位置为1，次高位置为0
 */
public class Plus_one {
    public int[] plusOne(int[] digits) {
        int len = digits.length;

        digits[len - 1]++;
        int j = len - 1;
        while (digits[j] == 10 && j > 0) {
            digits[j] = 0;
            digits[--j]++;
        }
        if (j == 0 && digits[0] == 10) {
            int[] new_arr = new int[len + 1];
            for (int i = len ; i > 1; i--) {
                new_arr[i] = digits[i - 1];
            }
            new_arr[0] = 1;
            new_arr[1]=0;
            return new_arr;
        } else


            return digits;
    }
}
