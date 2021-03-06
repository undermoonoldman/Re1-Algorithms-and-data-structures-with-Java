package com.undermoonoldman.re1.linear_search;

/**
 * @author arthurmeng
 */
public class LinearSearch {
    private LinearSearch(){}

    public static <E> int search(E[] data, E target){
        for(int i = 0 ; i < data.length ; i++){
            if(data[i].equals(target)){
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args){
        /***
         * 使用两个不同数量级的有序数组测试线性查找所消耗的时间
         */

        int[] dataSize = {1000000, 10000000};
        for(int n: dataSize) {
            Integer[] data = ArrayGenerator.generateOrderedArray(n);

            long startTime = System.nanoTime();
            for (int k = 0; k < 100; k++){
                LinearSearch.search(data, n);
            }

            long endTime = System.nanoTime();

            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("n = " + n + ", 100 runs : " + time + "s");
        }
    }
}
