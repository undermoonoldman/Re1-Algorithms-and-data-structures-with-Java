package com.undermoonoldman.re1.linear_search;

/**
 * @author arthurmeng
 */
public class ArrayGenerator {

    private ArrayGenerator(){}

    /***
     * 生成一个有序的数组
     * @param n
     * @return
     */
    public static Integer[] generateOrderedArray(int n){

        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i ++){
            arr[i] = i;
        }

        return arr;
    }
}

