package by.itacademy.hw10.task4.view;

import by.itacademy.hw10.task4.model.animal.Animal;

import java.util.List;

public interface AnimalJournalView {

    void print(List<Animal> animalList);

    void printAvailableAnimals();

    void printSoldAnimals();

    void printException(Exception e);
}

