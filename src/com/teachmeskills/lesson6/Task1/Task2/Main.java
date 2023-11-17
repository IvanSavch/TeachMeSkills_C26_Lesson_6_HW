package com.teachmeskills.lesson6.Task1.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[1];
        Scanner scanner = new Scanner(System.in);
        String name ;
        String surName;
        String passportNum;
        String group;
        int count = 1;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter name " + count);
             name = scanner.nextLine();
            System.out.println("Enter Last Name " + count);
             surName = scanner.nextLine();
            System.out.println("Enter passport Number " + count);
             passportNum = scanner.nextLine();
            System.out.println("Enter group " + count);
             group = scanner.nextLine();
            students[i] = Student.createStudent(name,surName,passportNum,group);
            count++;
        }
        for (Student student: students) {
            System.out.println(student.toString());
        }
    }
}
