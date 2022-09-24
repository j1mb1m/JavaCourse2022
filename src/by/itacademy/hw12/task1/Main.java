package by.itacademy.hw12.task1;

import java.util.Random;

/**
 * 1. Сгенерировать файлы in1.txt и in2.txt,
 * в каждом файле по 1000 чисел от 1 до 100000.
 * Создайте файл out.txt, который будет содержать
 * все отсортированные числа из файлов in1.txt и in2.txt.
 */
public class Main {

    private final static int COUNT_NUMBERS = 1000;
    private final static int MAX_VALUE = 100000;
    private final static String DELIMITER_PATTERN = "\n";

    public static void main(String[] args) {

        FileHandler fileHandler = new FileHandler(DELIMITER_PATTERN);

        fileHandler.writeFile("in1.txt", getStringRandomNumbers(COUNT_NUMBERS));
        fileHandler.writeFile("in2.txt", getStringRandomNumbers(COUNT_NUMBERS));

        fileHandler.mergeAndSortFiles("in1.txt", "in2.txt", "out.txt");

    }

    public static String getStringRandomNumbers(int count) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            sb.append(random.nextInt(MAX_VALUE)).append(DELIMITER_PATTERN);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
