package by.itacademy.hw7.task2.converter;

import by.itacademy.hw7.task2.entity.*;

public interface Converter {
    Temperature convert(Fahrenheit fahrenheit);
    Temperature convert(Celsius celsius);
    Temperature convert(Kelvin kelvin);
}
