package ru.gb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * lesson 2
 *
 */
public class App 
{
    public static void main( String[] args ) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Шарик", 3, 33, "Лайка");
        animals[1] = new Cat("Мурзик", 13, "Рыжий", "Ласковый");
        
        for (Animal animal : animals) {
            Class<?> personClass = animal.getClass();
            System.out.println("\nЖивотное: " + personClass.getSimpleName());
            Method displayInfo = personClass.getDeclaredMethod("getInfo");
            displayInfo.invoke(animal);
            
            Method[] methods = personClass.getDeclaredMethods();
            System.out.println();
            
            for (Method method : methods) {
                System.out.println("\tКоманда: " + method.getName());
            }
            try {
                Method makeSound = personClass.getDeclaredMethod("makeSound");
                makeSound.invoke(animal);
            } catch (NoSuchMethodException e) {
                System.out.println("Не умеет издавать голос!");
            }
            
            
        }
    }
}



