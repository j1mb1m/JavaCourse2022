package by.itacademy.hw7.task4.entity.flower;

import by.itacademy.hw7.task4.entity.Color;

public class Pion extends Flower{
    public Pion(Color color, double price, int storageDays) {
        super(color, price, storageDays);
        setType("Пион");
    }
}
