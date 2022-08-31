package by.itacademy.hw10.task4.service;

import by.itacademy.hw10.task4.datasource.AnimalAccountingJournal;
import by.itacademy.hw10.task4.model.animal.Animal;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalJournalHandler {

    public void addAnimal(AnimalAccountingJournal journal, Animal animal) {
        journal.getAnimalList().add(animal);
    }

    public void saleAnimal(AnimalAccountingJournal journal, Animal animal) {
        journal.getAnimalList().remove(animal);
        journal.getSoldAnimalList().add(animal);
    }

    public boolean returnAnimal(AnimalAccountingJournal journal, Animal animal) {

        if (!journal.getSoldAnimalList().contains(animal)) {

            System.out.println("Животное не продавалось! Возврат не возможен: " + animal);
            return false;
        }
        journal.getSoldAnimalList().remove(animal);
        journal.getAnimalList().add(animal);
        return true;
    }

    // Реализовать методы для упорядочивания всех питомцев по кличкам в алфавитном порядке,
    // сортировки питомцев по цене
    public List<Animal> sortByName(AnimalAccountingJournal journal) {
        return journal.getAnimalList().stream()
                .sorted((x, y) -> x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());
    }

    // сортировки питомцев по цене
    public List<Animal> sortByPrice(AnimalAccountingJournal journal) {
        return journal.getAnimalList().stream()
                .sorted((x, y) -> Double.compare(x.getPrice(), y.getPrice()))
                .collect(Collectors.toList());
    }

    // поиск питомца по заданному ценовому диапазону.
    public List<Animal> searchAnimalByPrice(AnimalAccountingJournal journal, double minPrice, double maxPrice) {
        return journal.getAnimalList().stream()
                .filter(x -> x.getPrice() >= minPrice && x.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

}
