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

    public boolean takeForks() {
        int countFork = 0;
        synchronized (getLeftFork()) {
            if (getLeftFork().isAvailable()) {
                getLeftFork().takeFork();
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countFork++;


                synchronized (getRightFork()) {
                    if (getRightFork().isAvailable()) {
                        getRightFork().takeFork();
                        System.out.printf("Философ %s взял вилку %s и %s%n", getId(), getLeftFork().getId(), getRightFork().getId());
                        countFork++;
                    } else {
                        getLeftFork().putFork();
                        countFork = 0;
                    }
                }
            }
        }

        return countFork==2;

    }

    public void putForks() {
        synchronized (getRightFork()) {
            getRightFork().putFork();

            synchronized (getLeftFork()) {
                getLeftFork().putFork();
                System.out.printf("Философ %s пололжил вилки %s и %s%n", getId(), getLeftFork().getId(), getRightFork().getId());
            }
        }
    }

    public Fork getLeftFork() {
        return leftFork;
    }

    public Fork getRightFork() {
        return rightFork;
    }

    @Override
    public void run() {

        boolean isNotEat = true;

        while (isNotEat){
            if (!takeForks()) continue;
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            isNotEat = false;
            eat();

            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            putForks();
            think();
        }
    }
}
