package by.itacademy.hw12.task5.logger;

import by.itacademy.hw12.task5.timehandler.CurrentDataTime;

public class ConsoleLogger implements Logger {

    private final Class<?> callerClass;

    public ConsoleLogger(Class<?> callerClass) {
        this.callerClass = callerClass;
    }

    @Override
    public void info(String message) {
        System.out.printf("%s INFO - %s %s%n", CurrentDataTime.getDataTime(), callerClass.getName(), message);
    }

    @Override
    public void warn(String message) {
        System.out.printf("%s WARN - %s %s%n",CurrentDataTime.getDataTime(), callerClass.getName(), message);
    }

    @Override
    public void error(String message) {
        System.out.printf("%s ERROR - %s %s%n",CurrentDataTime.getDataTime(), callerClass.getName(), message);
    }


}
