package by.itacademy.hw7.task2.entity;

public final class Kelvin extends Temperature {

    public Kelvin(double value) {
        super(value);
    }

    @Override
    public String toString() {
        return "Kelvin " + getValue();
    }
}

