package by.itacademy.hw9.task3.model;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {

    private final List<T> vehicles = new ArrayList<>();
    private final double area;

    public Garage(double area) {
        this.area = area;
    }

    public List<T> getVehicles() {
        return vehicles;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "garage=" + vehicles +
                ", area=" + area +
                '}';
    }
}
