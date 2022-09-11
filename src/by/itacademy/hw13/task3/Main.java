package by.itacademy.hw13.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать три потока, которые изменяют один и тот же объект.
 * Каждый поток должен вывести на экран цифру 100 раз, затем
 * увеличить ее значение на 1. Пример корректного вывода:
 * 1 1 1 1 1 …
 * 2 2 2 2 2 …
 * 3 3 3 3 3 …
 */
public class Main {
    public static void main(String[] args) {

        List<Thread> threadList = new ArrayList<>();
        threadList.add(new OutputThread());
        threadList.add(new OutputThread());
        threadList.add(new OutputThread());

        for (Thread thread: threadList) {
            thread.start();
        }

    }
}
