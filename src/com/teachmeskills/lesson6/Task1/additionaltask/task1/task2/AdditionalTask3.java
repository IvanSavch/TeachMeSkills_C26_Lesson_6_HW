package com.teachmeskills.lesson6.Task1.additionaltask.task1.task2;

public class AdditionalTask3 {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,4,5,6,7};
        int sum = 3;
        boolean isTrue = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int c = array[i] + array[j];
                if (c == sum){
                    isTrue = true;
                    break;
                }
            }
        }
        if (isTrue) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
