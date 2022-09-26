package by.itacademy.hw15.task1;

import by.itacademy.hw15.task1.model.Consumer;
import by.itacademy.hw15.task1.model.Producer;
import by.itacademy.hw15.task1.model.Store;

/**
 * Реализуйте классы Store, Producer, Consumer c помощью java.util.concurrent.Semaphore.
 * Производитель, помещает товары в магазин, потребитель -  покупает. Размер магазина
 * определяется переменной MAX_SIZE.
 */

public class Main {

    public static void main(String[] args) {
        Store store = new Store();

        for (int i = 0; i < 10; i++) {
            new Thread(new Consumer(store)).start();
            new Thread(new Producer(store)).start();
        }

    }
}
