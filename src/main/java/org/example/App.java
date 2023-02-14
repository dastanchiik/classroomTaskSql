package org.example;

import org.example.models.Car;
import org.example.models.Person;
import org.example.repository.CarRepo;
import org.example.repository.PersonRepo;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Kurmangazy",15,1.90,61.54);
        Car car = new Car("BMW m3 GTR",600,"500000$",person);
        PersonRepo personRepo = new PersonRepo();
        CarRepo carRepo = new CarRepo();
        carRepo.deleteById(1L);
    }
}
