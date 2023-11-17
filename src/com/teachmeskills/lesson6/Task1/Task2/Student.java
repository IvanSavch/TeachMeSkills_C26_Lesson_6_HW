package com.teachmeskills.lesson6.Task1.Task2;

/**
 * Create a class to describe a student in our group.
 * Class fields: first name, last name, passport number, group name (you can add your own fields if desired - for example, age).
 * Create objects of this class for each student in our group.
 * Place all these objects into an array.
 * Loop through the array with a for-each loop and output information to the console.
 */
public class Student {
    String name;
    String surName;
    String passportNumber;
    String group;

    public Student(String name, String surName, String passportNumber, String group) {
        this.name = name;
        this.surName = surName;
        this.passportNumber = passportNumber;
        this.group = group;
    }
    public static Student createStudent(String name, String surName, String passportNumber, String group) {
        return new Student(name,surName,passportNumber,group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", group='" + group + '\'' +
                '}';
    }


}
