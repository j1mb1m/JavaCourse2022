package by.itacademy.hw7.task3.entity;

import java.util.Objects;

public abstract class Fruit {
    private double weight;
    private double price;
    private String type;

    public String printManufacturerInfo() {
        return "Made in Belarus";
    }//переписала на функцию

    public abstract double getCost();

    public Fruit(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.getWeight(), getWeight()) == 0 && Double.compare(fruit.getPrice(), getPrice()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight(), getPrice());
    }

    @Override
    public String toString() {
        return type + " (" +
                printManufacturerInfo() + ")" +
                ", weight=" + weight +
                ", price=" + price +
                ", cost=" + getCost();
    }
}
