package com.achais.basic;

import java.util.Arrays;

/**
 * 数组
 * dataType[] arrayRefVar = new dataType[arraySize];
 */
public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[10];
        Integer[] arr3 = new Integer[10];

        // for-each 循环
        int[] numbers = {6, 1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        // 多维数组
        int[][] arr4 = new int[5][5];

        // Arrays 类
        Arrays.sort(numbers); // 排序
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(numbers, 5));
    }
}
