package org.example.repository;

import org.example.configuration.Configuration;
import org.example.models.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CarRepo {
     private static final SessionFactory connection = Configuration.getConnection();

     public void save(Car car){
         try (Session session = connection.openSession()){
             session.save(car);
             System.out.println("saved !!!");
         }
     }

     public Car getById(Long id){
         try (Session session = connection.openSession()){
             return session.get(Car.class,id);
         }
     }

     public List getAll(){
         try (Session session = connection.openSession()){
             return session.createQuery("select c from Car c").getResultList();
         }
     }

     public void deleteById(Long id){
         try (Session session = connection.openSession()){
             session.beginTransaction();
             session.delete(session.get(Car.class,id));
             session.getTransaction().commit();
         }
     }

     public void deleteAll(){
         try (Session session = connection.openSession()){
             session.beginTransaction();
             session.createQuery("delete from Car c");
             session.getTransaction().commit();
         }
     }
}
