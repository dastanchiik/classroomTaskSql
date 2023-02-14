package org.example.repository;

import org.example.configuration.Configuration;
import org.example.models.Car;
import org.example.models.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PersonRepo {
    private final SessionFactory connection = Configuration.getConnection();

    public void save(Person person){
        try (Session session = connection.openSession()){
            session.save(person);
            System.out.println("saved !!!");
        }
    }

    public Person getById(Long id){
        try (Session session = connection.openSession()){
            return session.get(Person.class,id);
        }
    }

    public List getAll(){
        try (Session session = connection.openSession()){
            return session.createQuery("select p from Person p").getResultList();
        }
    }

    public void deleteById(Long id){
        try (Session session = connection.openSession()){
            session.beginTransaction();
            session.delete(session.get(Person.class,id));
            session.getTransaction().commit();
        }
    }

    public void deleteAll(){
        try (Session session = connection.openSession()){
            session.beginTransaction();
            session.createQuery("delete from Person p");
            session.getTransaction().commit();
        }
    }
}
