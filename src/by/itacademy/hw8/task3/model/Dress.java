package by.itacademy.hw8.task3.model;

public class Dress extends Clothes {

    public Dress(ClothingSize size, Color color, double price) {
        super( "Платье", size, color,  price);
    }

    @Override
    public String toString() {
        return String.format("%s (id = %d): цвет='%s', размер='%s', цена='%1.2f'", getName(), getId(), getColor(), getSize(), getPrice());
    }

}
