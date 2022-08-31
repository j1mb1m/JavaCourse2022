package by.itacademy.hw8.task3.model.thing;

import by.itacademy.hw8.task3.model.size.ClothingSize;
import by.itacademy.hw8.task3.model.Color;

public class Dress extends Clothes {

    private final static String TYPE = "Платье";

    public Dress(ClothingSize size, Color color, double price) {
        super( TYPE, size, color,  price);
    }

}
