package by.itacademy.hw7.task2.entity;

public final class Fahrenheit extends Temperature {

    public Fahrenheit(double value) {
        super(value);
    }

    @Override
    public String toString() {
        return "Fahrenheit " + getValue();
    }
}
