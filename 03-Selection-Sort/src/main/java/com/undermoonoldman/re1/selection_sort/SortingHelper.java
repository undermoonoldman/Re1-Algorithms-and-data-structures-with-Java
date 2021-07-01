package com.undermoonoldman.re1.selection_sort;

/**
 * @author arthurmeng
 */
public class SortingHelper {

    private SortingHelper(){}

    /***
     * 检测数组是否已经有序
     * @param arr
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> boolean isSorted(E[] arr){

        for(int i = 1; i < arr.length; i ++){
            if(arr[i - 1].compareTo(arr[i]) > 0){
                return false;
            }
        }

        return true;
    }


    /***
     * 使用对应的排序算法对数组进行排序测试,排序失败会抛出异常
     * @param sortname
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void sortTest(String sortname, E[] arr){

        long startTime = System.nanoTime();
        if(sortname.equals("SelectionSort")){
            SelectionSort.sort(arr);
        }

        long endTime = System.nanoTime();

        double time = (endTime - startTime) / 1000000000.0;

        if(!SortingHelper.isSorted(arr)){
            throw new RuntimeException(sortname + " failed");
        }

        System.out.println(String.format("%s , n = %d : %f s", sortname, arr.length, time));
    }
}
