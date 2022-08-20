package by.itacademy.hw7.task3.entity;

public class Apple extends Fruit {

    public Apple(double weight, double price) {
        super(weight, price);
        setType("Яблоко");
    }

    @Override
    public double getCost() {
        return getPrice()*getWeight();
    }

}
