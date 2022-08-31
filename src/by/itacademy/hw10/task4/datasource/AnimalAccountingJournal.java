package by.itacademy.hw10.task4.datasource;

import by.itacademy.hw10.task4.model.Gender;
import by.itacademy.hw10.task4.model.animal.Animal;
import by.itacademy.hw10.task4.model.animal.Cat;
import by.itacademy.hw10.task4.model.animal.Dog;
import by.itacademy.hw10.task4.model.animal.Hamster;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


public class AnimalAccountingJournal {
    private final List<Animal> animalList = new ArrayList<>();
    private final List<Animal> soldAnimalList = new ArrayList<>();

    public AnimalAccountingJournal() {
        initData();
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public List<Animal> getSoldAnimalList() {
        return soldAnimalList;
    }

    private void initData() {
        animalList.add(new Cat("Васька", "Британская короткошерстая", "Голубой", new GregorianCalendar(2022, 3, 25), Gender.MALE, 120.5));
        animalList.add(new Cat("Василиса", "Британская короткошерстая", "Голубой", new GregorianCalendar(2022, 3, 25), Gender.FEMALE, 135.5));
        animalList.add(new Dog("Лунтик", "Лабрадор", "Черный", new GregorianCalendar(2022, 6, 10), Gender.MALE, 240.5));
        animalList.add(new Dog("Пума", "Лабрадор", "Коричневый", new GregorianCalendar(2022, 6, 10), Gender.FEMALE, 250.5));
        animalList.add(new Hamster("Пушек", "Джугарик", "Белый", new GregorianCalendar(2022, 8, 7), Gender.MALE, 20));
    }


}
