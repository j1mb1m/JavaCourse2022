package by.itacademy.hw7.task2.logic;

import by.itacademy.hw7.task2.entity.Celsius;
import by.itacademy.hw7.task2.entity.Fahrenheit;
import by.itacademy.hw7.task2.entity.Kelvin;
import by.itacademy.hw7.task2.entity.Temperature;

public class FahrenheitConverterImpl implements Converter{

    @Override
    public Temperature convert(Temperature temperature) {
        if (temperature instanceof Celsius) {
            return new Fahrenheit((1.8*temperature.getValue()) + 32);
        }
        else if (temperature instanceof Kelvin) {
            return new Fahrenheit((temperature.getValue()*9/5) -459.67);
        }
        return temperature;
    }
}
