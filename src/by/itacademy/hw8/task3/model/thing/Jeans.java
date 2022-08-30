package by.itacademy.hw8.task3.model.thing;

import by.itacademy.hw8.task3.model.size.ClothingSize;
import by.itacademy.hw8.task3.model.Color;

public class Jeans extends Clothes {

    private final static String type = "Джинсы";

    public Jeans(ClothingSize size, Color color, double price) {
        super(type, size, color,  price);
    }

}
