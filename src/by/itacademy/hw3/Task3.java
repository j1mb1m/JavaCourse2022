package by.itacademy.hw3;

import java.util.Scanner;

/*.	3.	Дни недели. Передать на вход программы число от 1 до 7 в качестве аргумента.
Если число не входит в диапазон 1-7, вывести сообщение об ошибке. Если число равно 1,
выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”. Д */

public class Task3 {

    public static void main(String[] args) {
        int num = enterFromScanner();

        switch (num) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Ошибка");
        }
    }

    public static int enterFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number >> ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Error! Try again >> ");
        }

        return scanner.nextInt();
    }

}
