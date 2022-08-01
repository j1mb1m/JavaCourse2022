package by.itacademy.hw3;

import java.util.Scanner;

/*2.	Передать на вход программы число, если оно нечетное положительное или четное  отрицательное, вывести соответствующий текст. */

public class Task2 {
    public static void main(String[] args) {
        int num = enterFromScanner();

        if(!isEven(num) && num > 0) System.out.printf("Число %d нечетное положительно", num);
        else if(isEven(num) && num < 0) System.out.printf("Число %d четное отрицательное", num);
    }

    public static int enterFromScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number >> ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Error! Try again >> ");
        }
        int num = scanner.nextInt();

        return num;
    }

    public static boolean isEven(int num){

        if (num % 2 == 0) return true;

        return false;
    }
}
