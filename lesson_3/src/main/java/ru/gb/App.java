package ru.gb;

import java.io.*;

/**
 * Lesson 3
 */
public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        Student student = new Student("Ivan", 32, 5.0);
        
        try (FileOutputStream fileOut = new FileOutputStream("results.bin");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(student);
            System.out.println("Объект сереализован!");
        }
        
        try (FileInputStream fileIn = new FileInputStream("results.bin");
             ObjectInputStream in = new ObjectInputStream(fileIn))
        {
            student = (Student)in.readObject();
            System.out.println("Объект десериализован!");
        }
        
        System.out.println("Имя: " + student.getName());
        System.out.println("Возраст: " + student.getAge());
        System.out.println("Возраст: " + student.getAge());
        System.out.println("Средний балл: " + student.getGPA());
    }
}

