package by.itacademy.hw10.task4.model.animal;

import by.itacademy.hw10.task4.model.Gender;

import java.util.Calendar;

public class Dog extends Animal{

    public Dog(String name, String breed, String color, Calendar dateOfBirth, Gender sex, double price) {
        super(name, breed, color, dateOfBirth, sex, price);
    }
}
