package by.itacademy.hw12.task1;

import java.util.Random;

/**
 * 1. Сгенерировать файлы in1.txt и in2.txt,
 * в каждом файле по 1000 чисел от 1 до 100000.
 * Создайте файл out.txt, который будет содержать
 * все отсортированные числа из файлов in1.txt и in2.txt.
 */
public class Main {

    public static void main(String[] args) {

        FileHandler.writeFile("in1.txt", getStringRandomNumbers(1000));
        FileHandler.writeFile("in2.txt", getStringRandomNumbers(1000));

        FileHandler.mergeAndSortFiles("in1.txt", "in2.txt", "out.txt");

    }

    public static String getStringRandomNumbers(int count) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            sb.append(random.nextInt(100000)).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
