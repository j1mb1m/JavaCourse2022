package by.itacademy.hm2;

public class Task6 {

    public static void main(String[] args) {

        double num1, num2, num3, maxNum;

        num1 = getRandomNumber();
        num2 = getRandomNumber();
        num3 = getRandomNumber();

        maxNum = minNumber(Math.abs(num1), Math.abs(num2), Math.abs(num3));

        System.out.printf("Из чисел %f, %f, %f самым наименьшим по модуль является %f", num1, num2, num3, maxNum);
    }

    public static double getRandomNumber(){
        return Math.random()*10-5;
    }

    public static double minNumber(double num1, double num2, double num3){
        return Math.min(Math.min(num1, num2), num3);
    }

}
