package by.itacademy.hw10.task4.service;

import by.itacademy.hw10.task4.model.animal.Animal;

import java.util.List;
import java.util.Map;

public interface AnimalJournalHandler {

    boolean addAnimal(Animal animal);

    boolean saleAnimal(Animal animal);

    boolean returnAnimal(Animal animal);

    List<Animal> toList(Map<String, List<Animal>> map);

    List<Animal> sortByName();

    List<Animal> sortByBreedAndDateOfBirth();

    List<Animal> sortByPrice();

    List<Animal> searchAnimalByPrice(double minPrice, double maxPrice);

}
