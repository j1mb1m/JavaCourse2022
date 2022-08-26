package by.itacademy.hw7.task2;

import by.itacademy.hw7.task2.entity.Celsius;
import by.itacademy.hw7.task2.entity.Fahrenheit;
import by.itacademy.hw7.task2.logic.*;

public class Main {
    public static void main(String[] args) {
        Converter conversionToFahrenheit = new FahrenheitConverterImpl();
        Converter conversionToKelvin= new KelvinConverterImpl();
        Converter conversionToCelsius = new CelsiusConverterImpl();

        Celsius centigrade = new Celsius(30);
        System.out.println("Перевод температуры " + centigrade);
        System.out.println(">" + conversionToFahrenheit.convert(centigrade));
        System.out.println(">" + conversionToKelvin.convert(centigrade));

        Celsius centigrade1 = new Celsius(0);
        System.out.println("Перевод температуры " + centigrade1);
        System.out.println(">" + conversionToFahrenheit.convert(centigrade1));
        System.out.println(">" + conversionToKelvin.convert(centigrade1));

        Celsius centigrade2 = new Celsius(-10);
        System.out.println("Перевод температуры " + centigrade2);
        System.out.println(">" + conversionToFahrenheit.convert(centigrade2));
        System.out.println(">" + conversionToKelvin.convert(centigrade2));

        Fahrenheit fahrenheit = new Fahrenheit(86);
        System.out.println("Перевод температуры " + fahrenheit);
        System.out.println(">" + conversionToCelsius.convert(fahrenheit));
        System.out.println(">" + conversionToKelvin.convert(fahrenheit));


    }
}
