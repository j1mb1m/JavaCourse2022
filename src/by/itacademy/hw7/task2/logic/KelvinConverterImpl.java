package by.itacademy.hw7.task2.logic;

import by.itacademy.hw7.task2.entity.Celsius;
import by.itacademy.hw7.task2.entity.Fahrenheit;
import by.itacademy.hw7.task2.entity.Kelvin;
import by.itacademy.hw7.task2.entity.Temperature;

public class KelvinConverterImpl implements Converter{

    @Override
    public Temperature convert(Temperature temperature) {
        if (temperature instanceof Fahrenheit) {
            return new Kelvin((temperature.getValue() + 459.67) * 5 / 9);
        }
        else if (temperature instanceof Celsius) {
            return new Kelvin(temperature.getValue() + 273.15);
        }
        return temperature;
    }
}
