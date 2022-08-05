package by.itacademy.hw3;

import java.util.Scanner;

/*5.	Передать на вход программы число от 0 до 59
(если оно не входит в диапазон, вывести сообщение об ошибке.).
Определите в какую четверть часа попадает это число (в первую,
 вторую, третью или четвертую).*/

public class Task5 {
    public static void main(String[] args) {

        int num = enterFromScanner();
        boolean isCorrectNumber = checkNumber(num);
        if (isCorrectNumber) {
            if (num < 15) System.out.println("Первая четверть");
            else if (num < 30) System.out.println("Вторая четверть");
            else if (num < 45) System.out.println("Третья четверть");
            else System.out.println("Четвертая четверть");
        }
    }

    public static int enterFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 0 to 59 >> ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Error! Try again >> ");
        }
        return scanner.nextInt();
    }

    public static boolean checkNumber(int num) {
        if (num > 60) {
            System.out.println("Error");
            return false;
        }
        return true;
    }
}


