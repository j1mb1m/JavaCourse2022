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

        Garage<Vehicle> vehicleGarage = new Garage<>(40);
        System.out.printf("Создан гараж для транспортных средств вместимостью %s%n", vehicleGarage.getArea());
        GarageHandler garageHandler = new GarageHandler();
        garageHandler.addVehicle(vehicleGarage, new Car("Audi", "12345", 30));
        garageHandler.addVehicle(vehicleGarage, new Motorcycle("Harley Davidson", "886699", 10));
        garageHandler.addVehicle(vehicleGarage, new Motorcycle("Harley Davidson", "555555", 10));

        garageHandler.inspectGarage(vehicleGarage);
        System.out.println();

        garageHandler.pullVehicle(vehicleGarage, new Motorcycle("Harley Davidson", "555555", 10));
        garageHandler.pullVehicle(vehicleGarage, new Motorcycle("Harley Davidson", "886699", 10));
        System.out.println();

        Garage<Motorcycle> motorcycleGarage = new Garage<>(30);
        System.out.printf("Создан гараж для мотоциклов вместимостью %s%n", motorcycleGarage.getArea());
        GarageHandler garageHandler1 = new GarageHandler();
        garageHandler1.addVehicle(motorcycleGarage, new Motorcycle("Harley Davidson", "886699", 10));
        garageHandler1.addVehicle(motorcycleGarage, new Motorcycle("Harley Davidson", "555555", 10));
        garageHandler1.addVehicle(motorcycleGarage, new Motorcycle("Harley Davidson", "555555", 10));

        garageHandler1.inspectGarage(motorcycleGarage);
        System.out.println();

        garageHandler.pullVehicle(motorcycleGarage, new Motorcycle("Harley Davidson", "555555", 10));
        garageHandler.pullVehicle(motorcycleGarage, new Motorcycle("Harley Davidson", "886699", 10));
        garageHandler1.inspectGarage(motorcycleGarage);
        System.out.println();

    }
}
