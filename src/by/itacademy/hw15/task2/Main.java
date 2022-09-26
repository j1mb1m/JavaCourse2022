package by.itacademy.hw15.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Создать задачу Callable, которая генерирует коллекцию из 10 рандомных целых чисел -> засыпает
 * произвольно на 1-10 секунд, результат выполнения – сумму этих чисел в виде строки. Запустить
 * 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени
 * потока, который выполняет работу.
 */

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        List<TaskCallable> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tasks.add(new TaskCallable());
        }

        List<Future<String>> futureList = pool.invokeAll(tasks);
        for (Future<String> future: futureList) {
            System.out.println(future.get());
        }

        pool.shutdown();
    }
}
