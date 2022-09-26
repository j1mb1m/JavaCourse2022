package by.itacademy.hw15.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class TaskCallable implements Callable<String> {

    final String START_LOG = "...начато выполнение потока %s %n";
    final String END_LOG = "...выполнился поток %s %s сек %n";
    final String RETURN_STRING = "%s итог выполнения %s";

    @Override
    public String call() throws Exception {

        System.out.printf(START_LOG, Thread.currentThread().getName());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(10 - (int) (Math.random() * 10));
        }

        Double timeSleep = Math.random() * 10000;
        Thread.sleep(1000 + timeSleep.intValue());

        System.out.printf(END_LOG, Thread.currentThread().getName(), timeSleep.intValue() / 1000 + 1);

        return String.format(RETURN_STRING, Thread.currentThread().getName(), list.stream().mapToInt(x -> x).sum());
    }
}
