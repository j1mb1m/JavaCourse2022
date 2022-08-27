package by.itacademy.hw7.task2;

import by.itacademy.hw7.task2.entity.Celsius;
import by.itacademy.hw7.task2.entity.Fahrenheit;
import by.itacademy.hw7.task2.converter.*;

public class Main {
    public static void main(String[] args) {
        Converter fahrenheitConverter = new FahrenheitConverter();
        Converter kelvinConverter= new KelvinConverter();
        Converter celsiusConverter = new CelsiusConverter();

        Celsius centigrade = new Celsius(30);
        System.out.println("Перевод температуры " + centigrade);
        System.out.println(">" + fahrenheitConverter.convert(centigrade));
        System.out.println(">" + kelvinConverter.convert(centigrade));

        Celsius centigrade1 = new Celsius(0);
        System.out.println("Перевод температуры " + centigrade1);
        System.out.println(">" + fahrenheitConverter.convert(centigrade1));
        System.out.println(">" + kelvinConverter.convert(centigrade1));

        Celsius centigrade2 = new Celsius(-10);
        System.out.println("Перевод температуры " + centigrade2);
        System.out.println(">" + fahrenheitConverter.convert(centigrade2));
        System.out.println(">" + kelvinConverter.convert(centigrade2));

        Fahrenheit fahrenheit = new Fahrenheit(86);
        System.out.println("Перевод температуры " + fahrenheit);
        System.out.println(">" + celsiusConverter.convert(fahrenheit));
        System.out.println(">" + kelvinConverter.convert(fahrenheit));


    }
}
