package by.itacademy.hw9.task3.service;

import by.itacademy.hw9.task3.model.Garage;
import by.itacademy.hw9.task3.model.Vehicle;

public class GarageHandler {

    public <T extends Vehicle> void addVehicle(Garage<? super T> garage, T vehicle) {

        if (garage.getGarage().contains(vehicle)) {
            System.out.printf("Транспортное средство : %s находится в гараже. Чтобы поставить в гараж, его надо достать из гаража предварительно.%n", vehicle);
        } else if (occupiedArea(garage) + vehicle.getArea() <= garage.getArea()) {
            garage.getGarage().add(vehicle);
            System.out.printf("Успешно припарковано транспортное средство в гараж : %s%n", vehicle);
        } else {
            System.out.printf("Извините, место в гараже закончилось! Найдите другой гараж для : %s%n", vehicle);
        }

    }

    public <T extends Vehicle> void pullVehicle(Garage<? super T> garage, T vehicle) {

        if (garage.getGarage().remove(vehicle)) {
            System.out.printf("Тарнспортное средство : %s успешно извлечено из гаража%n", vehicle);
        } else {
            System.out.printf("Тарнспортное средство отсутствует в гараже: %s%n", vehicle);
        }

    }

    private double occupiedArea(Garage<? extends Vehicle> garage) {

          return garage.getGarage().stream()
                  .map(x->x.getArea())
                  .reduce(0d, (x, y)-> x+y);
    }

    public void inspectGarage(Garage<? extends Vehicle> garage) {

        System.out.printf("%nВ гараже находится %d ед. транспортных средств%n", garage.getGarage().size());
        garage.getGarage().forEach(System.out::println);

    }

}
