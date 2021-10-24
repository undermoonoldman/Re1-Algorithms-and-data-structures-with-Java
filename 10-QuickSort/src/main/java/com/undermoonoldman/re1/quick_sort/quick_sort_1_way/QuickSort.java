package com.undermoonoldman.re1.quick_sort.quick_sort_1_way;

import java.util.Arrays;

/**
 * @author arthurmeng
 */
public class QuickSort {

    private QuickSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){
        sort(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r){

        if(l >= r) {
            return;
        }

        int p = partition(arr, l, r);
        sort(arr, l, p - 1);
        sort(arr, p + 1, r);
    }

    private static <E extends Comparable<E>> int partition(E[] arr, int l, int r){

        /***
         * 小于标定点的区间 arr[l+1...j] < v ; 大于等于标定点的区间 arr[j+1...i] >= v
         * 标定点的选取固定为区间的最左侧
         */
        int j = l;
        for(int i = l + 1; i <= r; i ++) {
            //当前值大于等于标定点扩展右区间，否则扩展左区间
            if(arr[i].compareTo(arr[l]) < 0){
                j ++;
                swap(arr, i, j);
            }
        }

        // 把标定点与左区间的最后一个值做交换，这样标定点就放置在大于等于区间的最左边
        swap(arr, l, j);
        return j;
    }

    private static <E> void swap(E[] arr, int i, int j){

        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args){

        int n = 1000000;

        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);

        SortingHelper.sortTest("MergeSort", arr);
        SortingHelper.sortTest("QuickSort", arr2);
    }
}
