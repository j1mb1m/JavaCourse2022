package by.itacademy.hw9.task3;

import by.itacademy.hw9.task3.model.Car;
import by.itacademy.hw9.task3.model.Garage;
import by.itacademy.hw9.task3.model.Motorcycle;
import by.itacademy.hw9.task3.model.Vehicle;
import by.itacademy.hw9.task3.service.GarageHandler;

/**
 * Машина и мотоцикл являются средствами передвижения.
 * В гараже могут находится только средства передвижения.
 * Разработать программу, позволяющую ставить средства
 * передвижения в гараж, доставать их оттуда и осматривать
 * содержимое гаража.
 */
public class Main {
    public static void main(String[] args) {
        Garage<Vehicle> garage = new Garage<>(40);
        System.out.printf("Создан гараж для транспортных средств вместимостью %s%n", garage.getArea());
        GarageHandler garageHandler = new GarageHandler();
        garageHandler.addVehicle(garage, new Car("Audi", "12345", 30));
        garageHandler.addVehicle(garage, new Motorcycle("Harley Davidson", "886699", 10));
        garageHandler.addVehicle(garage, new Motorcycle("Harley Davidson", "555555", 10));

        garageHandler.inspectGarage(garage);
        System.out.println();

        garageHandler.pullVehicle(garage, new Motorcycle("Harley Davidson", "555555", 10));
        garageHandler.pullVehicle(garage, new Motorcycle("Harley Davidson", "886699", 10));
        System.out.println();

        Garage<Motorcycle> garage1 = new Garage<>(30);
        System.out.printf("Создан гараж для мотоциклов вместимостью %s%n", garage1.getArea());
        GarageHandler garageHandler1 = new GarageHandler();
        garageHandler1.addVehicle(garage1, new Motorcycle("Harley Davidson", "886699", 10));
        garageHandler1.addVehicle(garage1, new Motorcycle("Harley Davidson", "555555", 10));
        garageHandler1.addVehicle(garage1, new Motorcycle("Harley Davidson", "555555", 10));

        garageHandler1.inspectGarage(garage1);
        System.out.println();

        garageHandler.pullVehicle(garage1, new Motorcycle("Harley Davidson", "555555", 10));
        garageHandler.pullVehicle(garage1, new Motorcycle("Harley Davidson", "886699", 10));
        garageHandler1.inspectGarage(garage1);
        System.out.println();

    }
}
