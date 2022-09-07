package by.itacademy.hw12.task4;

import by.itacademy.hw12.task4.model.PersonDataBase;
import by.itacademy.hw12.task4.service.PersonFileHandlerImpl;
import by.itacademy.hw12.task5.logger.ConsoleLogger;
import by.itacademy.hw12.task5.logger.FileLogger;

/**
 * Создать объект Person c полями name, surname, age. Создать 5
 * объектов класса Person и сохранить их состояние в файл.
 * Получить всех людей и вывести их на консоль в порядке возрастания по фамилии и имени.
 */
public class Main {
    public static void main(String[] args) {

        PersonFileHandlerImpl fileHandlerWithLogToConsole = new PersonFileHandlerImpl(new ConsoleLogger(PersonFileHandlerImpl.class));

        fileHandlerWithLogToConsole.writeFile("hw12_task4.ser", new PersonDataBase());
        PersonDataBase dataBaseSerialize =  fileHandlerWithLogToConsole.readFile("hw12_task4.ser");

        dataBaseSerialize.getPeople().forEach(System.out::println);

        PersonFileHandlerImpl fileHandlerWithLogToFile = new PersonFileHandlerImpl(new FileLogger(PersonFileHandlerImpl.class, "hw12_task4.log"));
        fileHandlerWithLogToFile.writeFile("hw12_task4.ser", new PersonDataBase());
        fileHandlerWithLogToFile.readFile("hw12_task4.ser");

       // dataBaseSerialize.getPeople().forEach(System.out::println);

    }
}
