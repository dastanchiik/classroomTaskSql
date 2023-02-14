package org.example.models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;

@Data
@ToString
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private int maxSpeed;
    private String prise;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id",referencedColumnName = "person_id")
    private Person person;

    public Car (){

    }

    public Car(String model, int maxSpeed, String prise, Person person) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.prise = prise;
        this.person = person;
    }
}
