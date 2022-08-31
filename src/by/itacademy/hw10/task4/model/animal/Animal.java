package by.itacademy.hw10.task4.model.animal;

import by.itacademy.hw10.task4.model.Gender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public abstract class Animal {
    private final String name;
    private final String breed;
    private final String color;
    private final Calendar dateOfBirth;
    private final Gender sex;
    private final double price;

    public Animal(String name, String breed, String color, Calendar dateOfBirth, Gender sex, double price) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.price = price;
    }

    public String getDateOfBirth(String format){

        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(dateOfBirth.getTime());
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.price, price) == 0 && Objects.equals(name, animal.name) && Objects.equals(breed, animal.breed) && Objects.equals(color, animal.color) && Objects.equals(dateOfBirth, animal.dateOfBirth) && sex == animal.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, color, dateOfBirth, sex, price);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", dateOfBirth=" + getDateOfBirth("dd.MM.yyyy") +
                ", sex=" + sex +
                ", price=" + price +
                '}';
    }
}
