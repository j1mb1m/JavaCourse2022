package by.itacademy.hw9.task3.model;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {
    private final List<T> garage = new ArrayList<>();
    private final double area;

    public Garage(double area) {
        this.area = area;
    }

    public List<T> getGarage() {
        return garage;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "garage=" + garage +
                ", area=" + area +
                '}';
    }
}
