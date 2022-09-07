package by.itacademy.hw12.task5;

import by.itacademy.hw12.task5.logger.ConsoleLogger;
import by.itacademy.hw12.task5.logger.FileLogger;
import by.itacademy.hw12.task5.logger.Logger;

public class Main {

    public static void main(String[] args) {

        Logger consoleLogger = new ConsoleLogger(Main.class);
        consoleLogger.info("это информация");
        consoleLogger.warn("это предупреждение");
        consoleLogger.error("это была ошибка");

        Logger fileLogger = new FileLogger(Main.class, "hw12_task5.log");
        fileLogger.info("это информация");
        fileLogger.warn("это предупреждение");
        fileLogger.error("это была ошибка");
    }

}
