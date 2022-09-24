package by.itacademy.hw12.task4.service;

import by.itacademy.hw12.task4.model.PersonDataBase;
import by.itacademy.hw12.task5.logger.Logger;

import java.io.*;

public class PersonFileHandlerImpl implements PersonFileHandler {

    private final Logger logger;

    public PersonFileHandlerImpl(Logger logger) {
        this.logger = logger;
    }

    public void writeFile(String fileName, PersonDataBase personDataBase) {
        logger.info("начинается запись данных в файл " + fileName);
        try (OutputStream outputStream = new FileOutputStream(fileName)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(personDataBase);
            logger.info(String.format("данные {%s} успешно записаны в файл %s",personDataBase.getPeople().toString(), fileName));
        } catch (IOException e) {
            logger.error(e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    public PersonDataBase readFile(String fileName) {
        logger.info("начинается чтение данных из файла " + fileName);
        PersonDataBase personDataBase = null;
        try (InputStream fileReader = new FileInputStream(fileName)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileReader);
            personDataBase = (PersonDataBase)objectInputStream.readObject();
            logger.info(String.format("данные {%s} успешно прочитаны из файла %s",personDataBase.getPeople().toString(), fileName));
        } catch (IOException | ClassNotFoundException e) {
            logger.error(e.getMessage());
            System.out.println(e.getMessage());
        }
        return personDataBase;
    }
}
