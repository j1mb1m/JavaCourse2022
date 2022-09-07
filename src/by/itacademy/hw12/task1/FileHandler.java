package by.itacademy.hw12.task1;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FileHandler {

    public static void writeFile(String fileName, String text) {
        try (Writer writer = new FileWriter(fileName)) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String readFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try (Reader reader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }

    public static void mergeAndSortFiles(String fileNameFirst, String fileNameSecond, String newFileName) {

        StringBuilder stringBuilder = new StringBuilder(FileHandler.readFile(fileNameFirst)).append("\n");
        stringBuilder.append(FileHandler.readFile(fileNameSecond));

        String[] str = stringBuilder.toString().split("\n");
        String numbers = Arrays.stream(str).sorted((x, y) -> Integer.compare(Integer.parseInt(x), Integer.parseInt(y))).collect(Collectors.joining("\n"));

        FileHandler.writeFile(newFileName, numbers);
    }

}
