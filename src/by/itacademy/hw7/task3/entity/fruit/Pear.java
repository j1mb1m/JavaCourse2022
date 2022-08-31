package by.itacademy.hw7.task3.entity.fruit;

import by.itacademy.hw7.task3.entity.fruit.Fruit;

public class Pear extends Fruit {

    public Pear(double weight, double price) {
        super(weight, price);
        setType("Груша");
    }

    @Override
    public double getCost() {
        return getPrice()*getWeight();
    }

    @Override
    public String printManufacturerInfo() {
        return "Made in Poland";
    }

}
