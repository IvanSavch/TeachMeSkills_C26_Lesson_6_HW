package com.teachmeskills.lesson6.Task1.additionaltask.task1.task4;

import java.util.Arrays;

public class AdditionalTask4 {
    public static void main(String[] args) {
        int[] array = new int[] {-8,5,4,6,8,0};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            int a = 0;
            a++;
            for (int j = a; j < array.length; j++) {
                int b = 1;
                b++;
                for (int k = b; k < array.length; k++) {
                    int c = array[i] + array[j] + array[k];
                    if (c == 0){
                        check = true;
                        break;
                    }
                }
            }
        }
        if (check) {
            System.out.println("yes");
        } else System.out.println("No");{

        }
    }
}
