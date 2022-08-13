package by.itacademy.hw4;

import java.util.Random;
import java.util.Scanner;

/*10.	 *Найти строку матрицы (двумерного массива) с максимальной суммой элементов.*/
public class Task10 {
    public static void main(String[] args) {

        int row = Math.abs(enterFromScanner("Введите количество строк массива: "));
        int column = Math.abs(enterFromScanner("Введите количество колонок массива: "));

        int[][] array = new int[row][column];
        initArray(array);
        printArray("Создан массив : ", array);
        System.out.println("Строка матрицы (двумерного массива) с максимальной суммой элементов находится под индексом " + getRowWithMaxSum(array));

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

    public static void initArray(int[][] array) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(200) - 100;
            }
        }
    }

    public static void printArray(String msg, int[][] array) {
        if (array == null) {
            System.out.println("Массив не создан!");
        } else {
            System.out.print(msg);
            System.out.println();
            for (int[] items : array) {
                for (int item : items) {
                    System.out.printf("%5d", item);
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static int getRowWithMaxSum(int[][] array) {
        if (array == null) return -1;
        if (array.length == 0) return -1;
        int index = 0;
        int maxSum = array[0][0];

        for (int i = 0; i < array.length; i++) {
            int rowSum = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            if (i == 0) maxSum = rowSum;

            if (rowSum > maxSum) {
                maxSum = rowSum;
                index = i;
            }
        }

        return index;
    }
}
