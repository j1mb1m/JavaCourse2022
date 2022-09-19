package by.itacademy.hw12.task4.service;

import by.itacademy.hw12.task4.model.PersonDataBase;

public interface PersonFileHandler {

    void writeFile(String fileName, PersonDataBase personDataBase);

    PersonDataBase readFile(String fileName);
}
