package com.undermoonoldman.re1.insertion_sort;

/**
 * @author arthurmeng
 */
public class InsertionSort {
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
