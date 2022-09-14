package by.itacademy.hw14.task2.model;

public class Fork {

    private static int counter = 1;
    private final int id;
    private boolean available = true;

    public Fork() {
        this.id = counter;
        counter++;
    }

    public int getId() {
        return id;
    }

    public void takeFork() {
        available = false;
    }

    public void putFork() {
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }

}
