package by.itacademy.hw8.task3.model;

public class Sneakers extends Shoe {

    public Sneakers(ShoeSize size, Color color, double price) {
        super("Кроссовки", size, color,  price);
    }

    @Override
    public String toString() {
        return String.format("%s (id = %d): цвет='%s', размер='%s', цена='%1.2f'", getName(), getId(), getColor(), getSize(), getPrice());
    }

}
