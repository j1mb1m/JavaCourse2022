package by.itacademy.hw7.task3.entity;

import by.itacademy.hw7.task3.controller.FruitArray;

public class Basket {
    private final FruitArray basket;

    public Basket() {
        this.basket = new FruitArray();
    }

    public void add(Fruit... fruits) {
        for (Fruit fruit : fruits) {
            add(fruit);
        }
    }

    public int size() {
        return basket.size();
    }

    public void add(Fruit fruit) {
        basket.add(fruit);
    }

    public Fruit get(int index) {
        return basket.get(index);
    }

    public void clear() {
        basket.clear();
    }

    public void remove(Fruit fruit) {
        basket.remove(fruit);
    }

    public FruitArray getBasket() {
        return basket;
    }

}
