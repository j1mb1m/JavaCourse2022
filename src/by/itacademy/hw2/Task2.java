package by.itacademy.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int num1, num2, num3;

        num1 = enterFromScanner("Введите первое целое число : ");
        num2 = enterFromScanner("Введите второе целое число : ");

        num3 = sumAndMultiplyNumbers(num1, num2);
        System.out.printf("Суммирование суммы и произведения чисел %d и %d состовляет : %d", num1, num2, num3);
    }

    public static int enterFromScanner(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        int num;
        while(!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Это не целое число, повторите ввод : ");
        }
        num = scanner.nextInt();
        return num;
    }

    public static int sumAndMultiplyNumbers(int x, int y) {

       return (x + y)+ x * y;

    }
}
