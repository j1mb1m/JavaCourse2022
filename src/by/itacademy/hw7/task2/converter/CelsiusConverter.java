package by.itacademy.hw7.task2.converter;

import by.itacademy.hw7.task2.entity.Celsius;
import by.itacademy.hw7.task2.entity.Fahrenheit;
import by.itacademy.hw7.task2.entity.Kelvin;
import by.itacademy.hw7.task2.entity.Temperature;

public class CelsiusConverter implements Converter{

    @Override
    public Temperature convert(Fahrenheit fahrenheit) {
        return new Celsius((fahrenheit.getValue()-32)*5/9);
    }

    @Override
    public Temperature convert(Celsius celsius) {
        return celsius;
    }

    @Override
    public Temperature convert(Kelvin kelvin) {
        return new Celsius(kelvin.getValue() - 273.15);
    }
}
