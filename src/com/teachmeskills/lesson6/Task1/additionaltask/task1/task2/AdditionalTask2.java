package com.teachmeskills.lesson6.Task1.additionaltask.task1.task2;

import java.util.Arrays;

public class AdditionalTask2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < k; i++) {
            int n = array[array.length - 1];
            for (int j = array.length - 1; j >= 0; j--) {
                if (j >= 1) {
                    array[j] = array[j - 1];
                } else {
                    array[0] = n;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}

