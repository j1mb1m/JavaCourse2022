package by.itacademy.hw13.task3;

public class OutputThread extends Thread {

    private static int count = 1;

    @Override
    public void run() {
        Counter.print();
    }

}
