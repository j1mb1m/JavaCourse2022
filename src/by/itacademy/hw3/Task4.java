package by.itacademy.hw3;


import java.util.Scanner;

/*4.	В три переменные a, b, и c записаны 3 целых неравных между собой числа. Создать программу, которая выведет числа по возрастанию.*/
public class Task4 {

    public static void main(String[] args) {

        int a, b, c;
        a = enterFromScanner();
        b = enterFromScanner();
        while(a == b) {
            System.out.printf("Число %d уже введено, введите другое. ", b);
            b = enterFromScanner();
        }
        c = enterFromScanner();
        while(a == c || b == c) {
            System.out.printf("Число %d уже введено, введите другое. ", c);
            b = enterFromScanner();
        }
        printSortedNumbers(a, b, c);
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

    public static void printSortedNumbers(int a, int b, int c){
        if (a < b && a < c) {
            System.out.println(a);
            printSortedNumbers(b, c);
        }
        else if (b < a && b < c) {
            System.out.println(b);
            printSortedNumbers(a, c);
        }
        else {
            System.out.println(c);
            printSortedNumbers(a, b);
        };

    }
    public static void printSortedNumbers(int a, int b){
        if (a < b) {
            System.out.println(a);
            System.out.println(b);
        }
        else {
            System.out.println(b);
            System.out.println(a);
        }

    }
}
