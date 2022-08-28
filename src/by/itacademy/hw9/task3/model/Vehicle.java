package by.itacademy.hw9.task3.model;

import java.util.Objects;

public abstract class Vehicle {
    private final String model;
    private final String registrationNumber;
    private final double area; //vehicle area

    public Vehicle(String model, String registrationNumber, double area) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.area = area;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getArea() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.area, area) == 0 && Objects.equals(model, vehicle.model) && Objects.equals(registrationNumber, vehicle.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, registrationNumber, area);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
