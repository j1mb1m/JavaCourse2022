package by.itacademy.hw4;

import java.util.Scanner;

/*2.	Найдите сумму и произведение цифр числа, введенного с клавиатуры.*/
public class Task2 {
    public static void main(String[] args) {
        int num = enterFromScanner("Введите целое число: ");
        System.out.println("Сумма цифр : " + sumNumbers(Math.abs(num)));
        System.out.println("Произведение цифр : " + multiplyNumbers(Math.abs(num)));
    }

    public static int enterFromScanner(String msg){
        Scanner scanner = new Scanner(System.in);

        System.out.print(msg);

        while(!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.print("Значение не верно! Повторите ввод: ");
        }
        return scanner.nextInt();
    }

    public static int sumNumbers(int num){
        if (num == 0) return 0;

        int result = 0;
        while (num > 0){
            result += num % 10;
            num /= 10;
        }
        return result;
    }

    public static int multiplyNumbers(int num){
        if (num == 0) return 0;

        int result = 1;
        while (num > 0){
            result *= num % 10;
            num /= 10;
        }
        return result;
    }
}
