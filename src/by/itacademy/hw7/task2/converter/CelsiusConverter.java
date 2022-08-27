package by.itacademy.hw7.task2.converter;

import by.itacademy.hw7.task2.entity.Celsius;
import by.itacademy.hw7.task2.entity.Fahrenheit;
import by.itacademy.hw7.task2.entity.Kelvin;
import by.itacademy.hw7.task2.entity.Temperature;

public class CelsiusConverter implements Converter{

    @Override
    public Temperature convert(Temperature temperature) {
        if (temperature instanceof Fahrenheit) {
            return new Celsius((temperature.getValue()-32)*5/9);
        }
        else if (temperature instanceof Kelvin) {
            return new Celsius(temperature.getValue() - 273.15);
        }
        return temperature;
    }
}
