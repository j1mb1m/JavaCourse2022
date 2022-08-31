package by.itacademy.hw7.task3.entity.fruit;

public class Apricot extends Fruit {

    public Apricot(double weight, double price) {
        super(weight, price);
        setType("Абрикос");
    }

    @Override
    public double getCost() {
        return getPrice()*getWeight();
    }

    @Override
    public String printManufacturerInfo() {
        return "Made in Turkey";
    }
}
