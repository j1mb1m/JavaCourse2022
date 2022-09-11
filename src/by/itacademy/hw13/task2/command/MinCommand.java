package by.itacademy.hw13.task2.command;

import java.util.List;

public class MinCommand implements Command, Runnable{

    private final List<Integer> list;
    private Thread thread;
    private int value;

    public MinCommand(List<Integer> list) {
        this.list = list;
        this.thread = new Thread(this);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int find() {
        return list.stream()
                .reduce(Integer::min)
                .get();
    }

    @Override
    public void run() {
        value = find();
    }
}
