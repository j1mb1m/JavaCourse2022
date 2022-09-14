package by.itacademy.hw14.task2.model;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private final List<Philosopher> philosophers = new ArrayList<>();

    public Table() {
        init();
    }

    public synchronized List<Philosopher> getPhilosophers() {
        return philosophers;
    }

    private void init() {

        Fork fork1 = new Fork();
        Fork fork2 = new Fork();
        Fork fork3 = new Fork();
        Fork fork4 = new Fork();
        Fork fork5 = new Fork();

        philosophers.add(new Philosopher(fork1, fork2));
        philosophers.add(new Philosopher(fork2, fork3));
        philosophers.add(new Philosopher(fork3, fork4));
        philosophers.add(new Philosopher(fork4, fork5));
        philosophers.add(new Philosopher(fork1, fork5));

    }

}
