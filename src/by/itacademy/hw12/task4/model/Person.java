package by.itacademy.hw12.task4.model;

import java.io.Serializable;

public class Person implements Serializable {

    static final long serialVersionUID = 7275913044206851571L;

    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', surname='%s', age=%s}", name, surname, age);
    }
}
