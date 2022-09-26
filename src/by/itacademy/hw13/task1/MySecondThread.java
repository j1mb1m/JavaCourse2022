package by.itacademy.hw13.task1;

public class MySecondThread extends Thread{

    private static final Object obj = new Object();

    public static Object getObj() {
        return obj;
    }

    @Override
    public void run() {
        try {
            synchronized (obj) {
                obj.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
