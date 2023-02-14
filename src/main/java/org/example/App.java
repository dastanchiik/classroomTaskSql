package org.example;

import org.example.models.Person;
import org.example.repository.PersonRepo;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Kurmangazy",15,1.90,61.54);
        Person person1 = new Person("Ermek",15,1.90,51.54);
        Person person2 = new Person("Bayel",15,1.90,65.3);
        Person person3 = new Person("Pushkin",49,1.90,73.4);
        Person person4 = new Person("Aza",34,1.90,74.54);
        PersonRepo personRepo = new PersonRepo();
        List<Integer>list = new ArrayList<>();

    }
}
