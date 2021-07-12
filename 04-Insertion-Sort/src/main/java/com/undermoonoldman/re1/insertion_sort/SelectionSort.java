package com.undermoonoldman.re1.insertion_sort;

/**
 * @author arthurmeng
 */
public class SelectionSort {
    public static <E extends Comparable<E>>  void sort(E[] arr){
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;

            for(int j = minIndex + 1; j < arr.length; j++){
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }

            swap(arr, i, minIndex);
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
            SortingHelper.sortTest("SelectionSort", arr);
        }
    }
}
