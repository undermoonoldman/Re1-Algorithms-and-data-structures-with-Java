package com.undermoonoldman.re1.insertion_sort;

/**
 * @author arthurmeng
 * 两种不同实现的插入排序
 */
public class InsertionSort {
    /***
     * 实现1：每次在比较符合条件时都执行交换操作，直到在该趟中放置到合适的位置。每次交换都带来了开销
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>>  void sort1(E[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j-1].compareTo(arr[j]) <= 0){
                    break;
                }

                swap(arr, j, j-1);
            }
        }
    }


    /***
     * 实现2：用临时变量把某一趟的比较元素存放起来，遇到需要交换的时候，用后移赋值代替，减少了部分开销
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>>  void sort2(E[] arr){
        for(int i = 0; i < arr.length; i++){
            E temp = arr[i];
            for(int j = i-1; j >= 0; j--){
                if(arr[j].compareTo(temp) <= 0){
                    arr[j] = temp;
                    break;
                }

                arr[j+1] = arr[j];
            }
        }
    }

    public static <E> void swap(E[] arr, int i, int j){
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args){

        int[] dataSize = {10000, 100000};
        for(int n: dataSize){
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.sortTest("InsertionSort1", arr);
        }

        for(int n: dataSize){
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.sortTest("InsertionSort2", arr);
        }
    }
}
