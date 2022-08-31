package by.itacademy.hw7.task2.converter;

import by.itacademy.hw7.task2.entity.Celsius;
import by.itacademy.hw7.task2.entity.Fahrenheit;
import by.itacademy.hw7.task2.entity.Kelvin;
import by.itacademy.hw7.task2.entity.Temperature;

public class FahrenheitConverter implements Converter{

    @Override
    public Temperature convert(Fahrenheit fahrenheit) {
        return new Fahrenheit((fahrenheit.getValue()*9/5) -459.67);
    }

    @Override
    public Temperature convert(Celsius celsius) {
        return new Fahrenheit((1.8*celsius.getValue()) + 32);
    }

    @Override
    public Temperature convert(Kelvin kelvin) {
        return kelvin;
    }
}
