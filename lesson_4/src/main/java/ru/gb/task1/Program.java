package ru.gb.task1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.gb.models.Course;

public class Program {
    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Course.class)
        .buildSessionFactory();
        
        Session session =sessionFactory.getCurrentSession();
        
        try {
            session.beginTransaction();
            Course course = Course.create("Основы python", 200);
            session.save(course);
//            
            Course retrievedCourse = session.get(Course.class, course.getId());
            
            System.out.println(retrievedCourse);
            
            retrievedCourse.setDuraction(400);
            session.update(retrievedCourse);
            session.delete(retrievedCourse);
            session.getTransaction().commit();
            
        }
        finally {
            sessionFactory.close();
        }
    }
}