package by.itacademy.hw8.task3.model.thing;

import by.itacademy.hw8.task3.model.size.ClothingSize;
import by.itacademy.hw8.task3.model.Color;

import java.util.Objects;

public abstract class Clothes extends Thing {

    private final ClothingSize size;

    public Clothes(String name, ClothingSize size, Color color, double price) {
        super(name, color,  price);
        this.size = size;
    }

    public ClothingSize getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clothes shoe = (Clothes) o;
        return size == shoe.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public String toString() {
        return String.format("%s (id = %d): цвет='%s', размер='%s', цена='%1.2f'", getName(), getId(), getColor(), getSize(), getPrice());
    }
}
