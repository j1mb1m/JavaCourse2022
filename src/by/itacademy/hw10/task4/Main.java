package by.itacademy.hw10.task4;

import by.itacademy.hw10.task4.datasource.AnimalAccountingJournal;
import by.itacademy.hw10.task4.model.Gender;
import by.itacademy.hw10.task4.model.animal.Cat;
import by.itacademy.hw10.task4.model.animal.Dog;
import by.itacademy.hw10.task4.service.AnimalJournalHandler;
import by.itacademy.hw10.task4.view.AnimalJournalView;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        AnimalAccountingJournal journal = new AnimalAccountingJournal();
        AnimalJournalHandler handler = new AnimalJournalHandler();
        AnimalJournalView journalView = new AnimalJournalView(handler);

        journalView.print(journal.getAnimalList());
        handler.addAnimal(journal, new Cat("Борман", "Мейн-кун", "рыжий", new GregorianCalendar(2022, 8, 10), Gender.MALE, 156));
        handler.saleAnimal(journal, new Dog("Пума", "Лабрадор", "Коричневый", new GregorianCalendar(2022, 6, 10), Gender.FEMALE, 250.5));
        handler.returnAnimal(journal, new Dog("Пума", "Лабрадор", "Коричневый", new GregorianCalendar(2022, 6, 10), Gender.MALE, 250.5));
        System.out.println("Сортируем по цене");
        journalView.print(handler.sortByPrice(journal));

        System.out.println("Сортируем по кличке");
        journalView.print(handler.sortByName(journal));
    }

}
