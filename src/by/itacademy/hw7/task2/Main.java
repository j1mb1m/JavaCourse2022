package by.itacademy.hw7.task2;

import by.itacademy.hw7.task2.entity.Centigrade;
import by.itacademy.hw7.task2.entity.Fahrenheit;
import by.itacademy.hw7.task2.entity.Kelvin;
import by.itacademy.hw7.task2.logic.TemperatureConversion;

public class Main {
    public static void main(String[] args) {
        Centigrade centigrade = new Centigrade(30);
        System.out.println("Перевод температуры " + centigrade);
        System.out.println(">" + TemperatureConversion.convertToFahrenheit(centigrade));
        System.out.println(">" + TemperatureConversion.convertToKelvin(centigrade));

        Centigrade centigrade1 = new Centigrade(0);
        System.out.println("Перевод температуры " + centigrade1);
        System.out.println(">" + TemperatureConversion.convertToFahrenheit(centigrade1));
        System.out.println(">" + TemperatureConversion.convertToKelvin(centigrade1));

        Centigrade centigrade2 = new Centigrade(-10);
        System.out.println("Перевод температуры " + centigrade2);
        System.out.println(">" + TemperatureConversion.convertToFahrenheit(centigrade2));
        System.out.println(">" + TemperatureConversion.convertToKelvin(centigrade2));
    }
}
