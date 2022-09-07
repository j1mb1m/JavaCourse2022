package by.itacademy.hw12.task3;

import java.util.Random;

/**
 * Записать в двоичный файл 30 случайных чисел от 1 до 100.
 * Прочитать записанный файл распечатать числа и их среднее
 * арифметическое (двоичный файл = файл, содержащий данные в виде байт).
 */
public class Main {

    public static final String FILE_NAME = "hw12_task3.txt";

    public static void main(String[] args) {

        FileHandler.writeFile(FILE_NAME, getByteRandomNumbers(30));
        printArrayBytes(FileHandler.readFile(FILE_NAME));

    }

    private static void printArrayBytes(byte[] bytes) {

        double arithmeticMean = 0;

        System.out.println("Прочитаны значения из двоичного файла: ");
        if (bytes.length != 0) {
            for (int i = 0; i < bytes.length; i++) {
                arithmeticMean += (int) bytes[i];
                System.out.printf("%s  ", (int) bytes[i]);
            }
            arithmeticMean /= bytes.length;
        }
        System.out.printf("%nСреднее арифметическое : %s", arithmeticMean);
    }

    public static byte[] getByteRandomNumbers(int count) {

        byte[] bytes = new byte[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int num = random.nextInt(100);
            bytes[i] = (byte) num;
            //System.out.println(num);
        }

        return bytes;
    }
}
