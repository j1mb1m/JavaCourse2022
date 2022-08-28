package by.itacademy.hw8.task3.model;

public class Dress extends Clothes {

    public final static String TYPE = "Платье";

    public Dress(ClothingSize size, Color color, double price) {
        super(TYPE, size, color,  price);
    }

    @Override
    public String toString() {
        return String.format("%s (id = %d): цвет='%s', размер='%s', цена='%1.2f'", TYPE, getId(), getColor(), getSize(), getPrice());
    }

}
