package by.itacademy.hw14.task2;

import by.itacademy.hw14.task2.model.Philosopher;
import by.itacademy.hw14.task2.model.Table;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Philosopher> philosophers = new Table().getPhilosophers();
        for (Philosopher philosopher : philosophers) {
            philosopher.start();
        }
        Thread.sleep(100);
    }

}
