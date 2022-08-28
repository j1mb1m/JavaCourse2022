package by.itacademy.hw7.task3.entity;

import by.itacademy.hw7.task3.service.FruitArray;

public class Basket {
    private final FruitArray basket;

    public Basket() {
        this.basket = new FruitArray();
    }

    public FruitArray getBasket() {
        return basket;
    }

}
