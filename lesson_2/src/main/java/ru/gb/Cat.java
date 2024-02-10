package ru.gb;

public class Cat extends Animal {
    private final String color;
    private final String nature;
    
    public Cat(String name, int age, String color, String nature) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.nature = nature;
    }
    
    public void toWash() {
        System.out.println(name + " Умывается!");
    }
    
    public void relax() {
        System.out.println(name + " Отдыхает!");
    }
    
    public void getInfo() {
        System.out.println("\n\tИмя: " + name + "\n\tВозраст: " + age + "\n\tЦвет: " + color + "\n\tХарактер:"+ nature);
        
    }

    public void makeSound() {
        System.out.println("МЯУ");
    }
}
