package by.itacademy.hw10.task4.service;

import by.itacademy.hw10.task4.exception.AnimalException;
import by.itacademy.hw10.task4.model.animal.Animal;

import java.util.List;
import java.util.Map;

public interface AnimalJournalHandler {

    void addAnimal(Animal animal) throws AnimalException;

    void saleAnimal(Animal animal) throws AnimalException;

    void returnAnimal(Animal animal)throws AnimalException;

    List<Animal> toList(Map<String, List<Animal>> map);

    List<Animal> sortByName();

    List<Animal> sortByBreedAndDateOfBirth();

    List<Animal> sortByPrice();

    List<Animal> searchAnimalByPrice(double minPrice, double maxPrice);

}
