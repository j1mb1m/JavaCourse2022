package by.itacademy.hw8.task3.model.thing;

import by.itacademy.hw8.task3.model.Color;
import by.itacademy.hw8.task3.model.size.ShoeSize;

public class Sneakers extends Shoe {

    private final static String TYPE = "Кроссовки";

    public Sneakers(ShoeSize size, Color color, double price) {
        super(TYPE, size, color,  price);
    }

}
