package by.itacademy.hw16.task2;

import java.util.Comparator;
import java.util.List;

/**
 * Дана коллекция Collection<Integer> col. С помощью stream API:
 * ○	найти минимальное число
 * ○	найти максимальное число
 * ○	найти среднее арифметическое чисел
 * ○	найти произведение всех чисел
 * ○	найти сумму всех чисел
 * ○	найти сумму всех цифр
 */

public class Main {

    private final static List<Integer> NUMBERS = List.of(1, 9, 13, 3, 7, 21);

    public static void main(String[] args) {

        System.out.printf("1. Get the min number: %s%n", getMinNumber());
        System.out.printf("2. Get the max number: %s%n", getMaxNumber());
        System.out.printf("3. Get the arithmetic mean : %.2f%n", getArithmeticMean());
        System.out.printf("4. Get the multiplication of all numbers: %s%n", getMultiplication());
        System.out.printf("5. Get the sum of all numbers: %s%n", getSum());
        System.out.printf("6. Get the sum of all digits: %s%n", getSumDigits());

    }

    public static int getMinNumber() {
        return NUMBERS.stream()
                .min(Comparator.comparingInt(x -> x))
                .stream().findFirst()
                .orElse(0);
    }

    public static int getMaxNumber() {
        return NUMBERS.stream()
                .min((x, y) -> y - x)
                .orElse(0);
    }

    public static double getArithmeticMean() {

        return NUMBERS.stream()
                .mapToInt((x) -> x)
                .average()
                .orElse(0);
    }

    public static int getMultiplication() {

        return NUMBERS.stream()
                .reduce((x, y) -> x * y)
                .orElse(0);
    }

    public static int getSum() {

        return NUMBERS.stream()
                .mapToInt(x -> x)
                .sum();
    }

    public static int getSumDigits() {

        return NUMBERS.stream()
                .map(x -> {
                    int sumOfDigits = 0;
                    while (x != 0) {
                        sumOfDigits += x % 10;
                        x /= 10;
                    }
                    return sumOfDigits;
                })
                .mapToInt(x -> x)
                .sum();
    }

}
