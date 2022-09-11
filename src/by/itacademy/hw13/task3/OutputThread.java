package by.itacademy.hw13.task3;

public class OutputThread extends Thread {

    private static int count = 1;

    @Override
    public void run() {
        synchronized ((Integer)count) {
            for (int i = 0; i < 100; i++) {
                System.out.printf("%s ", count);
            }
            System.out.println();
            count++;
        }
    }

}
