package by.itacademy.hw15.task1.model;

import java.util.concurrent.Semaphore;

public class Store {

    private int count;
    private Semaphore semaphoreProducer;
    private Semaphore semaphoreConsumer;
    private final int MAX_COUNT = 5;

    public Store() {
        this.count = 0;
        this.semaphoreProducer = new Semaphore(MAX_COUNT);
        this.semaphoreConsumer = new Semaphore(0);
    }

    public int getCount() {
        return count;
    }

    public void produce() {
        try {
            semaphoreProducer.acquire();
            Thread.sleep( (int)Math.random()*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.count++;
        System.out.println("Доставлен 1 товар");
        semaphoreConsumer.release();

    }

    public void buy() {
        try {
            semaphoreConsumer.acquire();
            Thread.sleep(500+(int)Math.random()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.count--;
        System.out.println("Куплен 1 товар");
        semaphoreProducer.release();
    }
}
