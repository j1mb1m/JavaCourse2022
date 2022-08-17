package by.itacademy.hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*2. Введите строку (текст). Найдите наибольшее количество идущих подряд цифр.*/
public class Task2 {

    public static void main(String[] args) {
        String str = enterFromScanner();
        System.out.printf("Text: \"%s\"", getTheLargestNumberOfDigits(str));
    }

    public static String getTheLargestNumberOfDigits(String str) {

        String[] arrayStrings = str.replaceAll("\\D+", " ").split(" ");
        StringBuilder stringBuilder = new StringBuilder(); //поместим все найденные цифровые слова с максимальным количеством цифр, чтобы сделать один проход

        int maxLength = 0;

        for (String string :
                arrayStrings) {
            if (string.length() > maxLength) {
                stringBuilder.delete(0, stringBuilder.length());
                stringBuilder.append(string).append(" ");
                maxLength = string.length();
            } else if (string.length() == maxLength) {
                stringBuilder.append(string).append(" ");
            }
        }

        return stringBuilder.toString().trim();
    }

    public static String enterFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");

        return scanner.nextLine();
    }
}
