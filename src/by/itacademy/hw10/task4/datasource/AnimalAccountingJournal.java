package by.itacademy.hw10.task4.datasource;

import by.itacademy.hw10.task4.model.Gender;
import by.itacademy.hw10.task4.model.animal.Animal;
import by.itacademy.hw10.task4.model.animal.Cat;
import by.itacademy.hw10.task4.model.animal.Dog;
import by.itacademy.hw10.task4.model.animal.Hamster;

import java.util.*;


public class AnimalAccountingJournal {

    //лучше делать не через map, но чисто в рамках эксперимента, почему бы и нет
    private final Map<String, List<Animal>> animalMap = new HashMap<>();
    private final List<Animal> soldAnimalList = new ArrayList<>();

    public AnimalAccountingJournal() {
        initData();
    }

    public Map<String, List<Animal>> getAnimalMap() {
        return animalMap;
    }

    public List<Animal> getSoldAnimalList() {
        return soldAnimalList;
    }

    private void initData() {
        animalMap.put("Анчоус", addToArrayList(new Cat("Анчоус", "Британская короткошерстая", "Голубой", new GregorianCalendar(2022, Calendar.JANUARY, 17), Gender.MALE, 120.5)));
        animalMap.put("Васька", addToArrayList(new Cat("Васька", "Британская короткошерстая", "Голубой", new GregorianCalendar(2022, Calendar.MARCH, 25), Gender.MALE, 120.5)));
        animalMap.put("Василиса", addToArrayList(new Cat("Василиса", "Британская короткошерстая", "Голубой", new GregorianCalendar(2022, Calendar.MARCH, 25), Gender.FEMALE, 135.5)));
        animalMap.put("Лунтик", addToArrayList(new Dog("Лунтик", "Лабрадор", "Черный", new GregorianCalendar(2022, Calendar.JUNE, 10), Gender.MALE, 240.5)));
        animalMap.put("Пума", addToArrayList(new Dog("Пума", "Лабрадор", "Коричневый", new GregorianCalendar(2022, Calendar.JUNE, 10), Gender.FEMALE, 250.5)));
        animalMap.put("Пушек", addToArrayList(new Hamster("Пушек", "Джунгарский", "Белый", new GregorianCalendar(2022, Calendar.AUGUST, 7), Gender.MALE, 20)));
    }

    private List<Animal> addToArrayList(Animal animal){
        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        return animals;
    }


}
