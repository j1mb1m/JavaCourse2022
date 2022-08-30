package by.itacademy.hw10.task4.model;

import java.util.Objects;

public abstract class Pet {

    private String name;
    private final String breed;
    private final String color;
    private int age;
    private double price;

    public Pet(String name, String breed, String color, int age, double price) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Double.compare(pet.price, price) == 0 && Objects.equals(name, pet.name) && Objects.equals(breed, pet.breed) && Objects.equals(color, pet.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, color, age, price);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
