package by.itacademy.hw3;

import java.util.Scanner;

/*7.	Пользователь вводит два целых однозначных числа.
 Программа задаёт вопрос: результат умножения первого числа на второе.
 Пользователь должен ввести ответ и увидеть на экране правильно
 он ответил или нет. Если нет  – показать еще и правильный результат.*/
public class Task7 {
    public static void main(String[] args) {

        int a = enterFromScanner("Введите первое число : ");
        int b = enterFromScanner("Введите второе число : ");

        int answer = enterFromScanner("Результат умножения первого числа на второе? Ответ : ");

        if (a * b == answer) {
            System.out.println("Верно!!");
        }
        else {
            System.out.printf("Не верно! Правильный ответ : %d", a*b);
        }
    }

    public static int enterFromScanner(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Ошибка! Повторите ввод >> ");
        }

        return scanner.nextInt();
    }
}
