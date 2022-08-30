package by.itacademy.hw8.task3.model.thing;

import by.itacademy.hw8.task3.model.size.ClothingSize;
import by.itacademy.hw8.task3.model.Color;

public class Shirt extends Clothes {

    private final static String type = "Рубашка";

    public Shirt(ClothingSize size, Color color, double price) {
        super(type, size, color,  price);
    }

}
