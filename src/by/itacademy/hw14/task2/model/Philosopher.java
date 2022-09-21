package by.itacademy.hw14.task2.model;

public class Philosopher extends Thread {

    private static int counter = 1;
    private final int id;
    private final Fork leftFork;
    private final Fork rightFork;

    public Philosopher(Fork leftFork, Fork rightFork) {
        this.id = counter;
        this.leftFork = leftFork;
        this.rightFork = rightFork;

        counter++;
    }

    public long getId() {
        return id;
    }

    public void eat() {
        System.out.printf("Философ %s ест%n", id);
    }

    public void think() {
        System.out.printf("Философ %s размышляет%n", id);
    }

    public synchronized void takeForks() throws InterruptedException {

        rightFork.takeFork();
        leftFork.takeFork();

    }

    public synchronized void putForks() {

        rightFork.putFork();
        leftFork.putFork();

    }

    @Override
    public void run() {
        boolean isEat = false;

        while (!isEat) {
            try {
                sleep((int)(Math.random()*500));

                takeForks();
                eat();
                sleep(500 + (int) (Math.random() * 1000));

                putForks();
                sleep((int) (Math.random() * 500));

                think();
                isEat = true;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
