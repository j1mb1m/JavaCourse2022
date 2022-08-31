package by.itacademy.hw7.task2.entity;

public abstract class Temperature {
    private final double value;

    public Temperature(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
