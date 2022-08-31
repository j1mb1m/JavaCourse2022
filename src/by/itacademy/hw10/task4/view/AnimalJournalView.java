package by.itacademy.hw10.task4.view;

import by.itacademy.hw10.task4.model.animal.Animal;
import by.itacademy.hw10.task4.service.AnimalJournalHandler;

import java.util.List;

public class AnimalJournalView {

    private final AnimalJournalHandler handler;

    public AnimalJournalView(AnimalJournalHandler handler) {
        this.handler = handler;
    }

    public void print(List<Animal> animalList) {

        animalList.forEach(System.out::println);
        System.out.println();
    }

    public void printAvailableAnimals() {

        System.out.println("Для покупки доступны следующие животные: ");
        print(handler.toList(handler.getJournal().getAnimalMap()));

    }

    public void printSoldAnimals() {

        System.out.println("Для проданы следующие животные: ");
        print(handler.getJournal().getSoldAnimalList());
        System.out.println();

    }

    public void printException(Exception e) {

        System.out.println(e.getMessage());
        System.out.println();

    }
}
