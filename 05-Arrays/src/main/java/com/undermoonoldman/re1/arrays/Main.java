package com.undermoonoldman.re1.arrays;

/**
 * @author arthurmeng
 */
public class Main {

    public static void main(String[] args) {

        StaticArray<Integer> staticArray = new StaticArray<>(20);
        for(int i = 0 ; i < 10 ; i ++){
            staticArray.addLast(i);
        }

        System.out.println(staticArray);

        staticArray.add(1, 100);
        System.out.println(staticArray);

        staticArray.addFirst(-1);
        System.out.println(staticArray);
        // [-1, 0, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        staticArray.remove(2);
        System.out.println(staticArray);

        staticArray.removeElement(4);
        System.out.println(staticArray);

        staticArray.removeFirst();
        System.out.println(staticArray);



        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        for(int j = 0 ; j < 10 ; j ++){
            dynamicArray.addLast(j);
        }

        System.out.println(dynamicArray);

        dynamicArray.add(1, 100);
        System.out.println(dynamicArray);

        dynamicArray.addFirst(-1);
        System.out.println(dynamicArray);

        dynamicArray.remove(2);
        System.out.println(dynamicArray);

        dynamicArray.removeElement(4);
        System.out.println(dynamicArray);

        dynamicArray.removeFirst();
        System.out.println(dynamicArray);
    }
}
