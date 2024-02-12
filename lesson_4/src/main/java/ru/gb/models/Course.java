package ru.gb.models;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int duraction;
    
    private Course(String title, int duraction) {

        this.title = title;
        this.duraction = duraction;
    }

    public Course() {
        
    }

    public static Course create(String title, int duraction){
        return new Course(title, duraction);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuraction() {
        return duraction;
    }

    public void setDuraction(int duraction) {
        this.duraction = duraction;
    }

    @Override
    public String toString() {
        return "id: " + id + " title: " + title + " duraction: " + duraction;
    }
}