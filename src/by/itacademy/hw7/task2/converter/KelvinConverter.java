package by.itacademy.hw7.task2.converter;

import by.itacademy.hw7.task2.entity.Celsius;
import by.itacademy.hw7.task2.entity.Fahrenheit;
import by.itacademy.hw7.task2.entity.Kelvin;
import by.itacademy.hw7.task2.entity.Temperature;

public class KelvinConverter implements Converter{

    @Override
    public Temperature convert(Fahrenheit fahrenheit) {
        return new Kelvin((fahrenheit.getValue() + 459.67) * 5 / 9);
    }

    @Override
    public Temperature convert(Celsius celsius) {
        return new Kelvin(celsius.getValue() + 273.15);
    }

    @Override
    public Temperature convert(Kelvin kelvin) {
        return kelvin;
    }
}
