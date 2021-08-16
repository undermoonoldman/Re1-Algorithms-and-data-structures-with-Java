package com.undermoonoldman.re1.recursion.linked_list_problems_in_leetcode;

/**
 * 数组求和递归实现
 * @author Arthur-DeskTop
 */
public class Sum {

    public static int sum(int[] arr){
        return sum(arr, 0);
    }

    /***
     * 计算arr[l...n)这个区间内所有数字的和
     * @param arr
     * @param l
     * @return
     */
    private static int sum(int[] arr, int l){
        if(l == arr.length) {
            return 0;
        }
        return arr[l] + sum(arr, l + 1);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum(nums));
    }
}
