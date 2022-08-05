package by.itacademy.hw3;

import java.util.Scanner;

/*1.	Четное-нечетное.Передать на вход программы число, если оно нечетное, распечатать его.*/
public class Task1 {

    public static void main(String[] args) {
       int num = enterFromScanner();

       if(!isEven(num)) System.out.printf("Число %d нечетное", num);

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
