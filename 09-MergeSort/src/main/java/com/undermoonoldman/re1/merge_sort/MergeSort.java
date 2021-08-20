package com.undermoonoldman.re1.merge_sort;

import java.util.Arrays;


/**
 * @author arthurmeng
 */
public class MergeSort {

    private MergeSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){

        sort(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r){
        //区间段已无法继续拆分，递归到底
        if (l >= r) {
            return;
        }

        // 中点下标的计算如果用 mid = (l + r) / 2 这样来计算的有可能会溢出
        int mid = l + (r - l) / 2;

        //递归处理左半边
        sort(arr, l, mid);

        //递归处理右半边
        sort(arr, mid + 1, r);

        //左右半边都处理完毕，执行归并
        merge(arr, l, mid, r);
    }

    /***
     * 合并两个有序的区间 arr[l, mid] 和 arr[mid + 1, r]
     * @param arr
     * @param l
     * @param mid
     * @param r
     * @param <E>
     */
    private static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r){
        //每次归并都需要开临时空间来存储区间中的值，新开空间与原数组区间存在着偏移量
        E[] temp = Arrays.copyOfRange(arr, l, r + 1);

        //左区间范围[l, mid]，右区间范围[mid+1, r]，初始时双指针分别指向两个区间的头部(最小值)
        int i = l, j = mid + 1;

        // 每轮循环为 arr[k] 赋值
        for(int k = l; k <= r; k ++){
            //左指针跨过中点，只取右区间的值
            if(i > mid){
                arr[k] = temp[j - l]; j ++;
            }
            //右指针跨过右区间终点，只取左区间的值
            else if(j > r){
                arr[k] = temp[i - l]; i ++;
            }
            //其他情况下，比较左右指针所指的值，谁小就从哪个区间取
            else if(temp[i - l].compareTo(temp[j - l]) <= 0){
                arr[k] = temp[i - l]; i ++;
            }
            else{
                arr[k] = temp[j - l]; j ++;
            }
        }
    }

    public static void main(String[] args){

        int[] dataSize = {10000, 100000};
        for(int n: dataSize){
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
            Integer[] arr3 = Arrays.copyOf(arr, arr.length);

            SortingHelper.sortTest("SelectionSort", arr);
            SortingHelper.sortTest("InsertionSort", arr2);
            SortingHelper.sortTest("MergeSort", arr3);
        }
    }
}
