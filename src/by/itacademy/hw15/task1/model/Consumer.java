package by.itacademy.hw15.task1.model;

public class Consumer implements Runnable{
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.buy();
    }
}
