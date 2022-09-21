package by.itacademy.hw14.task2.model;

public class Fork {

    private static int counter = 1;
    private final int id;
    private boolean isAvailable = true;

    public Fork() {
        this.id = counter;
        counter++;
    }

    public synchronized void takeFork() throws InterruptedException{

        while (!isAvailable){
            wait();
        }
        isAvailable = false;
        System.out.println("Философ " +Thread.currentThread().getId() + " взял вилку " + id);
    }

    public synchronized void putFork() {
        isAvailable = true;
        System.out.println("Философ " + Thread.currentThread().getId() + " положил вилку " + id);
        notifyAll();
    }

}
