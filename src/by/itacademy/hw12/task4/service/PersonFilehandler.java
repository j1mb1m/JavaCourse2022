package by.itacademy.hw12.task4.service;

import by.itacademy.hw12.task4.model.PersonDataBase;

public interface PersonFilehandler {

    void writeFile(String fileName, PersonDataBase personDataBase);

    PersonDataBase readFile(String fileName);
}
