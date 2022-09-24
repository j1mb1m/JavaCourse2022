package by.itacademy.hw12.task1;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FileHandler {

    private final String DELIMITER_PATTERN;

    public FileHandler(String DELIMITER_PATTERN) {
        this.DELIMITER_PATTERN = DELIMITER_PATTERN;
    }

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
                stringBuilder.append(line).append(DELIMITER_PATTERN);
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }

    public void mergeAndSortFiles(String fileNameFirst, String fileNameSecond, String newFileName) {

        StringBuilder stringBuilder = new StringBuilder(readFile(fileNameFirst)).append(DELIMITER_PATTERN);
        stringBuilder.append(readFile(fileNameSecond));

        String[] str = stringBuilder.toString().split(DELIMITER_PATTERN);
        String numbers = Arrays.stream(str).sorted((x, y) -> Integer.compare(Integer.parseInt(x), Integer.parseInt(y))).collect(Collectors.joining(DELIMITER_PATTERN));

        writeFile(newFileName, numbers);
    }

}
