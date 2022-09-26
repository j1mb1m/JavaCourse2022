package by.itacademy.hw13.task1;

public class MyFirstThread extends Thread {
    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
