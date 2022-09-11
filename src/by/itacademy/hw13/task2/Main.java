package by.itacademy.hw13.task2;

import by.itacademy.hw13.task2.command.MaxCommand;
import by.itacademy.hw13.task2.command.MinCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры значения в массив,
 * после чего запускаются два потока. Первый поток находит
 * максимум в массиве, второй — минимум. Результаты
 * вычислений возвращаются в метод main().
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list = enterFromScanner();
        System.out.println(list);

        MaxCommand maxValue = new MaxCommand(list);
        MinCommand minValue = new MinCommand(list);
        try {
            maxValue.getThread().join();
            minValue.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Max value: %s%n", maxValue.getValue());
        System.out.printf("Min value: %s%n", minValue.getValue());

    }

    public static List<Integer> enterFromScanner(){
        List<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers (press Q to complete): ");

        while (true) {
            if (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            } else {if (scanner.next().equalsIgnoreCase("q")) break;}

        }
        return list;

    }
}
