package ru.gb;

public class Dog extends Animal {
    private final int weight;
    private final String breed;
    
    public Dog(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }
    
    public void sit() {
        System.out.println(name + " Сидеть!");
    }
    
    public void nearby() {
        System.out.println(name + " Рядом!");
    }
    
    public void getInfo() {
        System.out.println("\n\tИмя: " + name + "\n\tВозраст: " + age + "\n\tВес: " + weight + "\n\tПорода: " + breed);
    }
    
//    public void makeSound() {
//        System.out.println("ГАВ");
//    }
}

