package by.itacademy.hw13.task1;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread myFirstThread = new MyFirstThread();
        Thread mySecondThread = new MySecondThread();

        System.out.println(myFirstThread.getState());

        myFirstThread.start();
        mySecondThread.start();

        System.out.println(myFirstThread.getState());

        sleep(500);

        System.out.println(myFirstThread.getState());
        System.out.println(mySecondThread.getState());

        sleep(2000);

        Object obj = MySecondThread.getObj();
        synchronized (obj){
            obj.notify();
        }

        System.out.println(mySecondThread.getState());
        sleep(500);
        System.out.println(mySecondThread.getState());


    }
}
