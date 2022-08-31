package by.itacademy.hw10.task4.view;

import by.itacademy.hw10.task4.model.animal.Animal;
import by.itacademy.hw10.task4.service.AnimalJournalHandler;

import java.util.List;

public class AnimalJournalView {

    private final AnimalJournalHandler handler;

    public AnimalJournalView(AnimalJournalHandler handler) {
        this.handler = handler;
    }

    public void print(List<Animal> animalList){
        animalList.forEach(System.out::println);
    }
}
