package by.itacademy.hw15.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class TaskCallable implements Callable<String> {

    @Override
    public String call() throws Exception {

        System.out.printf("...начато выполнение потока %s %n", Thread.currentThread().getName());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(10 - (int) (Math.random() * 10));
        }

        Double timeSleep = Math.random() * 10000;
        Thread.sleep(1000+timeSleep.intValue());

        System.out.printf("...выполнился поток %s %s сек %n", Thread.currentThread().getName(), timeSleep.intValue()/1000+1);

        return String.format("%s итог выполнения %s",Thread.currentThread().getName(),
                list.stream()
                .reduce(Integer::sum)
                .get());
    }
}
