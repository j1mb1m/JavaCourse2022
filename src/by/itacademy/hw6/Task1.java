package by.itacademy.hw6;

import java.util.Scanner;

/*1. Вводится ненормированная строка, у которой могут быть пробелы в начале,
в конце и между словами более одного пробела. Привести ее к нормированному виду,
т.е. удалить все пробелы в начале и конце, а между словами оставить только один пробел.*/
public class Task1 {

    public static void main(String[] args) {
        String str = enterFromScanner();
        System.out.printf("Text: \"%s\"", removeExtraSpaces(str));
    }

    public static String removeExtraSpaces(String str) {
        return str.replaceAll("\\s{2,}", " ").trim();
    }

    public static String enterFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");

        return scanner.nextLine();
    }
}
