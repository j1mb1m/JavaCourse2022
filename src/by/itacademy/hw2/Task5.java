package by.itacademy.hw2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int num = enterFromScanner("Введите целое число : ");
        boolean numIsEven = isEven(num);

        System.out.println("Число " + num + " является " + (numIsEven ? "четным" : "нечетным"));

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

    public static boolean isEven(int num) {

        return (num % 2 == 0) ? true : false;
    }

}
