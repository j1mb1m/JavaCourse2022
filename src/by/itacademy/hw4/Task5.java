package by.itacademy.hw4;

import java.util.Random;
import java.util.Scanner;

/*5.	Найти минимальный из элементов массива с нечетными индексами.*/
public class Task5 {

    public static void main(String[] args) {

        int size = Math.abs(enterFromScanner("Введите размер массива : "));
        int[] array = new int[size];

        initArray(array);
        printArray(array);

        int index = getOddIndexMinNumber(array);

        if (index == -1)
            System.out.printf("Размер массива слишком мал для перебора нечетных индексов.");
        else
            System.out.printf("Минимальное число %d из нечетных индексов находится под индексом %d.", array[index], index);
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
            array[i] = random.nextInt(100);
        }

    }

    public static void printArray(int[] array) {
        if (array == null) {
            System.out.println("Массив не создан!");
        } else {
            System.out.print("Создан массив [");
            for (int value : array) {
                System.out.printf("%5d", value);
            }
            System.out.print(" ]");
        }
        System.out.println();
    }

    public static int getOddIndexMinNumber(int[] array){
        if (array == null) return -1;
        if (array.length < 2) return -1;

        int index = 1;
        int value = array[1];

        for (int i = 0; i < array.length; i++) {
            if(i % 2 != 0 && array[i] < value) {
                index = i;
                value = array[i];
            }
        }
        return index;
    }


}
