package by.itacademy.hw15.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class TaskCallable implements Callable<String> {

    @Override
    public String call() throws Exception {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(10 - (int) (Math.random() * 10));
        }

        Thread.sleep((int) (Math.random() * 10000));

        return String.format("%s итог выполнения %s",Thread.currentThread().getName(), list.stream()
                .reduce(Integer::sum)
                .get());
    }
}
