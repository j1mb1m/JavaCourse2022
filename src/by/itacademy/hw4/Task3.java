package by.itacademy.hw4;

import java.util.Scanner;

/*3.	Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
1! = 1
2! = 1 * 2
3! = 1 * 2 * 3
4! = 1 * 2 * 3 *4
*/
public class Task3 {

    public static void main(String[] args) {
        int num = enterFromScanner("Ведите натуральное число : ");
        if (num < 0) num = Math.abs(num);

        System.out.printf("Факториал числа %d равен %d", num, factorial(num));
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

    public static int factorial(int num){
        int result = 1;
        for (int i = 1; i <= num; i++) {
           result*= i;
        }
        return result;
    }
}
