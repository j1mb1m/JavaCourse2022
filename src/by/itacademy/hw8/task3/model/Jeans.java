package by.itacademy.hw8.task3.model;

public class Jeans extends Clothes {

    public Jeans(ClothingSize size, Color color, double price) {
        super("Джинсы", size, color,  price);
    }

    @Override
    public String toString() {
        return String.format("%s (id = %d): цвет='%s', размер='%s', цена='%1.2f'", getName(), getId(), getColor(), getSize(), getPrice());
    }

}
