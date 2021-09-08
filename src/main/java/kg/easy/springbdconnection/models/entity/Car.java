package kg.easy.springbdconnection.models.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "cars")
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     Long id;
    @Column(nullable = false)
     String model;
     int year;
     boolean active;
     String color;
     @Column(length = 12)
     String description;
}
