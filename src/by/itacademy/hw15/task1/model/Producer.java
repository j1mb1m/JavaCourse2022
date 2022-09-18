package by.itacademy.hw15.task1.model;


public class Producer implements Runnable{

    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.produce();
    }
}
