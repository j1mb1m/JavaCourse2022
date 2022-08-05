package by.itacademy.hw4;

import java.util.Random;
import java.util.Scanner;

/*6.	Разложить положительные и отрицательные числа по разным массивам.*/
public class Task6 {

    public static void main(String[] args) {

        int size = Math.abs(enterFromScanner("Введите размер массива : "));
        int[] array = new int[size];

        initArray(array);
        printArray("Создан массив ", array);

        printArray("Создан массив с положительными числами ", createPositiveArray(array));
        printArray("Создан массив с отрицательными числами ", createNegativeArray(array));

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
            array[i] = random.nextInt(200)-100;
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

    public static int countPositiveNumbers(int[] array){
        if (array == null) return 0;

        int count = 0;

        for (int item : array) {
            if (item > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countNegativeNumbers(int[] array){
        if (array == null) return 0;

        int count = 0;

        for (int item : array) {
            if (item < 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] createPositiveArray(int[] array){
        int size = countPositiveNumbers(array);
        int[] newArray = new int[size];

        int currentIndex = 0;
        for (int item : array) {
            if (item > 0) {
                newArray[currentIndex] = item;
                currentIndex++;
                if (currentIndex >= size) break;
            }
        }

        return newArray;
    }

    public static int[] createNegativeArray(int[] array){
        int size = countNegativeNumbers(array);
        int[] newArray = new int[size];

        int currentIndex = 0;
        for (int item : array) {
            if (item < 0) {
                newArray[currentIndex] = item;
                currentIndex++;
                if (currentIndex >= size) break;
            }
        }
        return newArray;
    }

}
