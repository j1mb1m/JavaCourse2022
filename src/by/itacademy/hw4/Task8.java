package by.itacademy.hw4;

import java.util.Random;
import java.util.Scanner;

/*8.	Отсортировать массив используя следующий алгоритм:
●	сортировки пузырьком
●	сортировки вставками
●	сортировки выбором
*/
public class Task8 {
    public static void main(String[] args) {

        int size = Math.abs(enterFromScanner("Введите размер массива : "));
        int[] array = new int[size];

        initArray(array);
        printArray("Создан массив ", array);

        int item = chooseAction();
        while (item != 0) {
            switch (item) {
                case 1:
                    sortArrayByBubble(array);
                    printArray("Массив отсортирован сортировкой пузырьком : ", array);
                    item = chooseAction();
                    break;
                case 2:
                    sortArrayByInserts(array);
                    printArray("Массив отсортирован сортировкой вставками : ", array);
                    item = chooseAction();
                    break;
                case 3:
                    sortArrayByChoice(array);
                    printArray("Массив отсортирован сортировкой выбором : ", array);
                    item = chooseAction();
                    break;
                case 4:
                    initArray(array);
                    printArray("Создан массив ", array);
                    item = chooseAction();
                    break;
                default:
                    break;
            }

        }
    }

    public static int chooseAction() {
        printInfo();
        int item = enterFromScanner("Ваше действие (укажите цифру): ");
        while (item < 0 || item > 4) {
            item = enterFromScanner("Ошибка. Ваше действие (укажите цифру): ");
        }
        return item;
    }

    public static void printInfo() {
        System.out.println();
        System.out.println("Доступные команды: ");
        System.out.println("1 - сортировка пузырьком;");
        System.out.println("2 - сортировка вставками;");
        System.out.println("3 - сортировка выбором;");
        System.out.println("4 - перезаполнить массив;");
        System.out.println("0 - выход из программы");
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

    //печать массива
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

    //сортировка пузырьком
    public static void sortArrayByBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //сортировка вставками
    public static void sortArrayByInserts(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            for (; j >= 0; j--) {
                if (temp < array[j])
                    array[j + 1] = array[j];
                else break;
            }
            array[j + 1] = temp;
        }
    }

    //сортировки выбором
    public static void sortArrayByChoice(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            int value = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < value) {
                    value = array[j];
                    index = j;
                }
            }
            if (i != index) {
                array[index] = array[i];
                array[i] = value;
            }
        }
    }

}
