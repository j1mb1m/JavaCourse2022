package by.itacademy.hw12.task5.logger;

import by.itacademy.hw12.task5.timehandler.CurrentDataTime;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileLogger implements Logger {

    private final String FILE_NAME;
    private final Class<?> callerClass;

    public FileLogger(Class<?> callerClass, String fileName) {
        this.callerClass = callerClass;
        this.FILE_NAME = fileName;
    }

    @Override
    public void info(String message) {
        writeToFile(String.format("%s INFO - %s %s", CurrentDataTime.getDataTime(), callerClass.getName(), message));
    }

    @Override
    public void warn(String message) {
        writeToFile(String.format("%s WARN - %s %s", CurrentDataTime.getDataTime(), callerClass.getName(), message));
    }

    @Override
    public void error(String message) {
        writeToFile(String.format("%s ERROR - %s %s", CurrentDataTime.getDataTime(), callerClass.getName(), message));
    }

    private void writeToFile(String text) {

        try (Writer writer = new FileWriter(FILE_NAME, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.newLine();
            bufferedWriter.write(text);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
