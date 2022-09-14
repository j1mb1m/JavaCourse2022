package by.itacademy.hw14.task1;

import java.time.LocalTime;

import static java.lang.Thread.sleep;

public class Timer implements Runnable{

    private final int secondTimeOut;

    public Timer(int secondTimeOut) {
        this.secondTimeOut = secondTimeOut;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(LocalTime.now().toString());
            try {
                sleep(secondTimeOut*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
