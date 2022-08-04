package by.itacademy.hw2;

public class Task3 {

    public static void main(String[] args) {

        int time = getRandomNumber();
        System.out.println("Промежуток времени " + time + " секунд");
        printDataTime(time);
    }

    public static int getRandomNumber(){
        return (int)(Math.random()*100000000);
    }

    public static void printDataTime(int time){

        int week, day, hour, minute, second;

        second = time % 60 ;
        time = (time - second)/60;

        minute = time % 60;
        time = (time - minute)/ 60;

        hour = time % 24;
        time = (time - hour)/ 24;

        day = time % 7;
        time = (time - day)/ 7;

        week = time;

        System.out.printf("Время: %d недель %d дней %d часов %d минут %d секунд" , week, day, hour, minute, second);
    }
}
