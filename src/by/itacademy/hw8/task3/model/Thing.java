package by.itacademy.hw8.task3.model;

import java.util.Objects;

public abstract class Thing {
    private Color color;
    private static int counter = 1;
    private final String name;
    private double price;
    private final int id;

    public Thing(String name, Color color,  double price) {
        this.color = color;
        this.name = name;
        this.price = price;
        this.id = counter;
        counter = ++counter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Double.compare(thing.price, price) == 0 && Objects.equals(color, thing.color) && Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, name, price);
    }
}
