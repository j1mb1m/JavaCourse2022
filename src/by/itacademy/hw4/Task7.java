package by.itacademy.hw4;

import java.util.Random;
import java.util.Scanner;

/*7.	 Создать массив заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать*/
public class Task7 {

    public static void main(String[] args) {

        int size = Math.abs(enterFromScanner("Введите размер массива : "));
        int[] array = new int[size];
        initArray(array);
        printArray("Создан массив ", array);

        reverseArray(array);
        printArray("Массив перевернут ", array);
    }

    public static int enterFromScanner(String msg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(msg);

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Значение не верно! Повторите ввод: ");
        }
        return scanner.nextInt();
    }

    public static void initArray(int[] array) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
        }

    }

    public static void printArray(String msg, int[] array) {
        if (array == null) {
            System.out.println("Массив не создан!");
        } else {
            System.out.print(msg + " [");
            for (int value : array) {
                System.out.printf("%5d", value);
            }
            System.out.print(" ]");
        }
        System.out.println();
    }

    public static void reverseArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

    }
}
