package ru.gb;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private final double gpa;
    transient double GPA;
    
    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        gpa = GPA;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGPA() {
        return GPA;
    }
}
