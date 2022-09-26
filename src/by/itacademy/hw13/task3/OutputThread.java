package by.itacademy.hw13.task3;

public class OutputThread extends Thread {

    @Override
    public void run() {
        Counter.print();
    }

}
