package by.itacademy.hw10.task4;

import by.itacademy.hw10.task4.model.Gender;
import by.itacademy.hw10.task4.model.animal.Cat;
import by.itacademy.hw10.task4.model.animal.Dog;
import by.itacademy.hw10.task4.service.AnimalJournalHandlerImpl;
import by.itacademy.hw10.task4.view.AnimalJournalViewImpl;
import by.itacademy.hw10.task4.view.StatusBar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        AnimalJournalHandlerImpl handler = new AnimalJournalHandlerImpl(new StatusBar());
        AnimalJournalViewImpl journalView = new AnimalJournalViewImpl(handler);

        journalView.printAvailableAnimals();

        handler.addAnimal(new Cat("Борман", "Мейн-кун", "рыжий", new GregorianCalendar(2022, Calendar.AUGUST, 10), Gender.MALE, 156));
        handler.addAnimal(new Cat("Маргаритка", "Джунгарский", "белый", new GregorianCalendar(2022, Calendar.AUGUST, 20), Gender.MALE, 22.5));
        handler.saleAnimal(new Dog("Пума", "Лабрадор", "Коричневый", new GregorianCalendar(2022, Calendar.JULY, 10), Gender.FEMALE, 250.5));
        handler.saleAnimal(new Dog("Пума", "Лабрадор", "Коричневый", new GregorianCalendar(2022, Calendar.JUNE, 10), Gender.FEMALE, 250.5));
        handler.returnAnimal(new Dog("Пума", "Лабрадор", "Коричневый", new GregorianCalendar(2022, Calendar.JUNE, 10), Gender.MALE, 250.5));

        journalView.print(handler.sortByPrice());

        journalView.print(handler.sortByName());

        journalView.print(handler.sortByBreedAndDateOfBirth());

        journalView.print(handler.searchAnimalByPrice(0, 60));

        journalView.printSoldAnimals();
    }

}
