package by.itacademy.hw8.task3.model.thing;

import by.itacademy.hw8.task3.model.Color;
import by.itacademy.hw8.task3.model.size.ShoeSize;

public class Boots extends Shoe {

    private final static String TYPE = "Ботинки";

    public Boots(ShoeSize size, Color color, double price) {
        super(TYPE, size, color,  price);
    }

}
