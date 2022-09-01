package by.itacademy.hw10.task4.model.animal;

import by.itacademy.hw10.task4.model.Gender;

import java.util.Calendar;

public class Dog extends Animal{

    public Dog(String name, String breed, String color, Calendar dateOfBirth, Gender sex, double price) {
        super(name, breed, color, dateOfBirth, sex, price);
    }

    @Override
    public String toString() {
        return String.format("Собака: имя = '%s', порода = '%s', цвет = '%s', дата рождения = '%s', пол = '%s', цена  = '%s'",
                getName(), getBreed(), getColor(), getDateOfBirth("dd.MM.yyyy"), getSex(), getPrice());
    }
}
