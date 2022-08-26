package by.itacademy.hw7.task3.entity;

import by.itacademy.hw7.task3.controller.FruitArray;

public class Basket {
    private final FruitArray basket;

    public Basket() {
        this.basket = new FruitArray();
    }

    public void addFruit(Fruit[] fruits) {
        for (Fruit fruit : fruits) {
            addFruit(fruit);
        }
    }

    public int countFruit() {
        return basket.size();
    }

    public void addFruit(Fruit fruit) {
        basket.add(fruit);
    }

    public Fruit getFruit(int index) {
        return basket.get(index);
    }

    public void clearBasket() {
        basket.clear();
    }

    public boolean removeFruit(Fruit fruit) {
        return basket.remove(fruit);
    }
    public boolean removeFruit(int index) {
        return basket.remove(index);
    }
    public FruitArray getBasket() {
        return basket;
    }

}
