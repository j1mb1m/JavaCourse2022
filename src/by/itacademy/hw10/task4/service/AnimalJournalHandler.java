package by.itacademy.hw10.task4.service;

import by.itacademy.hw10.task4.datasource.AnimalAccountingJournal;
import by.itacademy.hw10.task4.exception.AnimalAlreadyExistsException;
import by.itacademy.hw10.task4.exception.AnimalNotExistException;
import by.itacademy.hw10.task4.model.animal.Animal;

import java.util.*;
import java.util.stream.Collectors;

public class AnimalJournalHandler {

    private final AnimalAccountingJournal journal;

    public AnimalJournalHandler() {
        this.journal = new AnimalAccountingJournal();
    }

    public AnimalAccountingJournal getJournal() {
        return journal;
    }

    public void addAnimal(Animal animal) throws AnimalAlreadyExistsException {

        if (journal.getAnimalMap().containsKey(animal.getName())) {
            List<Animal> animals = journal.getAnimalMap().get(animal.getName());
            if (animals.contains(animal)) {
                throw new AnimalAlreadyExistsException(String.format("Упс.. Такой питомц уже внесен в базу. %s", animal));
            } else {
                animals.add(animal);
                journal.getAnimalMap().put(animal.getName(), animals);
            }
        } else {
            List<Animal> animals = new ArrayList<>();
            animals.add(animal);
            journal.getAnimalMap().put(animal.getName(), animals);
        }

    }

    public void saleAnimal(Animal animal) throws AnimalNotExistException {

        if (!journal.getAnimalMap().containsKey(animal.getName())) {
            throw new AnimalNotExistException(String.format("Упс.. Такого питомца нет в базе. %s", animal));
        }

        List<Animal> animals = journal.getAnimalMap().get(animal.getName());
        if (!animals.contains(animal)) {
            System.out.println("...упс питомца такого нет!");
            throw new AnimalNotExistException(String.format("Упс.. Такого питомца нет в базе. %s", animal));
        }

        animals.remove(animal);
        journal.getSoldAnimalList().add(animal);

        if (animals.size() == 0) {
            //если нет записей по ключу - удалим сам ключ
            journal.getAnimalMap().remove(animal.getName());
        } else {
            //обновим записи по ключу
            journal.getAnimalMap().put(animal.getName(), animals);
        }

    }

    public void returnAnimal(Animal animal) throws AnimalNotExistException, AnimalAlreadyExistsException {

        if (!journal.getSoldAnimalList().contains(animal)) {
            throw new AnimalNotExistException(String.format("Животное не продавалось! Возврат не возможен: %s", animal));
        }

        journal.getSoldAnimalList().remove(animal);
        addAnimal(animal);

    }

    public List<Animal> toList(Map<String, List<Animal>> map) {

        Set<Map.Entry<String, List<Animal>>> entries = map.entrySet();
        List<Animal> animalList = new ArrayList<>();

        for (Map.Entry<String, List<Animal>> pair : entries) {
            animalList.addAll(pair.getValue());
        }

        return animalList;
    }

    // Реализовать методы для упорядочивания всех питомцев по кличкам в алфавитном порядке,
    public List<Animal> sortByName() {

        List<Animal> animalList = toList(journal.getAnimalMap());
        animalList.sort((x, y) -> x.getName().compareTo(y.getName()));

        return animalList;
    }

    //демонстрация компоратора (без лямбда-выражений)
    public List<Animal> sortByBreedAndDateOfBirth() {

        List<Animal> animalList = toList(journal.getAnimalMap());
        animalList.sort(new Comparator<>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                if (o1.getBreed().compareTo(o2.getBreed()) == 0) {
                    if (o1.getDateOfBirth().compareTo(o2.getDateOfBirth()) == 0)
                        return o1.getName().compareTo(o2.getName());
                    return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
                }
                return o1.getBreed().compareTo(o2.getBreed());
            }
        });

        return animalList;

    }

    // сортировки питомцев по цене
    public List<Animal> sortByPrice() {

        List<Animal> animalList = toList(journal.getAnimalMap());
        animalList.sort((x, y) -> Double.compare(x.getPrice(), y.getPrice()));

        return animalList;
    }

    // поиск питомца по заданному ценовому диапазону.
    public List<Animal> searchAnimalByPrice(double minPrice, double maxPrice) {

        return toList(journal.getAnimalMap()).stream()
                .filter(x -> x.getPrice() >= minPrice && x.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

}
