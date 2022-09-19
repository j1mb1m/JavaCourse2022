package by.itacademy.hw12.task2;

import java.io.*;

public class FileHandler {

    public void writeFile(String fileName, String text) {
        try (Writer writer = new FileWriter(fileName)) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String readFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try (Reader reader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }


}
