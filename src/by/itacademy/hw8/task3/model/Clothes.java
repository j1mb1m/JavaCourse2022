package by.itacademy.hw8.task3.model;

import java.util.Objects;

public abstract class Clothes extends Thing{
    private ClothingSize size;

    public Clothes(String name, ClothingSize size, Color color, double price) {
        super(name, color,  price);
        this.size = size;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
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
}
