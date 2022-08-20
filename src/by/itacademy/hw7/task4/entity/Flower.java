package by.itacademy.hw7.task4.entity;

import java.util.Objects;

public abstract class Flower {
    private String type;
    private Color color;
    private double price;
    private int storageDays;

    public Flower(Color color, double price, int storageDays) {
        this.color = color;
        this.price = price;
        this.storageDays = storageDays;
        this.type = "Неизвестный цветок";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStorageDays() {
        return storageDays;
    }

    public void setStorageDays(int storageDays) {
        this.storageDays = storageDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.getPrice(), getPrice()) == 0 && getStorageDays() == flower.getStorageDays() && getType().equals(flower.getType()) && getColor().equals(flower.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getColor(), getPrice(), getStorageDays());
    }

    @Override
    public String toString() {
        return type + '\'' +
                ", цвет =" + color +
                ", цена =" + price +
                ", дни хранения =" + storageDays;
    }
}
