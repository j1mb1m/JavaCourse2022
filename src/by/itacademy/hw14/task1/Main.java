package by.itacademy.hw14.task1;

import java.util.Scanner;

/**
 * 1. Создать служебный поток, который будет каждые
 * n секунд выводить системное время. n задается
 * через конструктор потока и вводится пользователем с клавиатуры.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        int secondTimeOut = enterFromScanner("Введите время в секундах : ");

        Thread thread = new Thread(new Timer(secondTimeOut));
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(10000);

    }

    public static int enterFromScanner(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);

        while(!scanner.hasNextInt()){
            scanner.nextLine();
        }
        return scanner.nextInt();
    }
}
