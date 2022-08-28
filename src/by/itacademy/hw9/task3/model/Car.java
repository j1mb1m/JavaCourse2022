package by.itacademy.hw9.task3.model;

public class Car extends Vehicle{
    public Car(String model, String registrationNumber, double area) {
        super(model, registrationNumber, area);
    }

    @Override
    public String toString() {
        return String.format("Машина : модель '%s', регистрационный номер %s", getModel(), getRegistrationNumber());
    }
}
