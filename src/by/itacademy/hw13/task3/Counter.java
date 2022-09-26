package by.itacademy.hw13.task3;

public class Counter {
    private static int count = 1;

    public static synchronized void print() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%s ", count);
        }
        System.out.println();
        count++;
    }
}
