package by.itacademy.hw7.task2.entity;

public final class Centigrade extends Temperature {

    public Centigrade(double value) {
        super(value);
    }

    @Override
    public String toString() {
        return "Centigrade " + getValue();
    }

}
