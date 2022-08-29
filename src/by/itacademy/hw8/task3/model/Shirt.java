package by.itacademy.hw8.task3.model;

public class Shirt extends Clothes {

    public Shirt(ClothingSize size, Color color, double price) {
        super("Рубашка", size, color,  price);
    }

    @Override
    public String toString() {
        return String.format("%s (id = %d): цвет='%s', размер='%s', цена='%1.2f'", getName(), getId(), getColor(), getSize(), getPrice());
    }

}
