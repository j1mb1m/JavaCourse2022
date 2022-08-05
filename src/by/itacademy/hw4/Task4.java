package by.itacademy.hw4;

import java.util.Random;
import java.util.Scanner;

/*4.	Найти максимальный и минимальный элементы массива и вывести их индексы на экран.*/
public class Task4 {

    public static void main(String[] args) {

        int size = Math.abs(enterFromScanner("Введите размер массива : "));
        int[] array = new int[size];

        initArray(array);
        printArray(array);

        int indexMin = getIndexMinNumber(array);
        int indexMax = getIndexMaxNumber(array);

        if (indexMin == -1 || indexMax == -1)  System.out.printf("Размер массива слишком мал для перебора индексов.");
        else {
            System.out.printf("Максимальное число %d находится под индексом %d", array[indexMax], indexMax);
            System.out.println();
            System.out.printf("Минимальное число %d находится под индексом %d", array[indexMin], indexMin);
        }
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

    public static void initArray(int[] array){

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

    }

    public static int getIndexMaxNumber(int[] array){
        if (array == null) return -1;
        if (array.length == 0) return -1;

        int index = 0;
        int value = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] > value) {
                index = i;
                value = array[i];
            }
        }
        return index;
    }

    public static int getIndexMinNumber(int[] array){
        if (array == null) return -1;
        if (array.length == 0) return -1;

        int index = 0;
        int value = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] < value) {
                index = i;
                value = array[i];
            }
        }
        return index;
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


}
