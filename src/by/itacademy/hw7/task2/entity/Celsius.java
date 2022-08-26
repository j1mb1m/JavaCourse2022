package by.itacademy.hw7.task2.entity;

public final class Celsius extends Temperature {

    public Celsius(double value) {
        super(value);
    }

    @Override
    public String toString() {
        return "Celsius " + getValue();
    }

}
