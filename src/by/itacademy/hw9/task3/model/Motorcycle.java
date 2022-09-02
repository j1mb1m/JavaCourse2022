package by.itacademy.hw9.task3.model;

public class Motorcycle extends Vehicle{

    public Motorcycle(String model, String registrationNumber, double area) {
        super(model, registrationNumber, area);
    }

    @Override
    public String toString() {
        return String.format("Мотоцикл : модель '%s', регистрационный номер %s", getModel(), getRegistrationNumber());
    }
}
