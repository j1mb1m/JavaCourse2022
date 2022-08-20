package by.itacademy.hw7.task2.logic;

import by.itacademy.hw7.task2.entity.Centigrade;
import by.itacademy.hw7.task2.entity.Fahrenheit;
import by.itacademy.hw7.task2.entity.Kelvin;

public final class TemperatureConversion {

    public static Fahrenheit convertToFahrenheit(Centigrade centigrade){
        return new Fahrenheit((1.8*centigrade.getValue()) + 32);
    }

    public static Fahrenheit convertToFahrenheit(Kelvin kelvin){
        return  new Fahrenheit((kelvin.getValue()*9/5) -459.67);
    }

    public static Centigrade convertToCentigrade(Fahrenheit fahrenheit){

        return new Centigrade((fahrenheit.getValue()-32)*5/9);
    }

    public static Centigrade convertToCentigrade(Kelvin kelvin){

        return new Centigrade(kelvin.getValue() - 273.15);
    }
    public static Kelvin convertToKelvin(Fahrenheit fahrenheit) {

        return new Kelvin((fahrenheit.getValue() + 459.67) * 5 / 9);
    }

    public static Kelvin convertToKelvin(Centigrade centigrade) {

        return new Kelvin(centigrade.getValue() + 273.15);
    }
}
