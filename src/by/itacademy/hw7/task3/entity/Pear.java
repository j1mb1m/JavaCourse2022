package by.itacademy.hw7.task3.entity;

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
    public void printManufacturerInfo() {
        System.out.print("Made in Poland");
    }

    @Override
    public String toString() {
        return this.getType() + ": вес " + getWeight() + ", цена " + getPrice() + ", стоимость "+ getCost();
    }
}
