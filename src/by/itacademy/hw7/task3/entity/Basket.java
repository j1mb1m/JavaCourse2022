package by.itacademy.hw7.task3.entity;

import by.itacademy.hw7.task3.controller.FruitArray;

import java.util.List;

public class Basket {
    private final FruitArray basket;

    public Basket() {
        this.basket = new FruitArray();
    }

    public void add(Fruit... fruits) {
        for (Fruit fruit : fruits) {
            basket.add(fruit);
        }
    }

    public void add(Fruit fruit) {
        basket.add(fruit);
    }

    public void clear() {
        basket.clear();
    }

    public void remove(Fruit fruit) {
        basket.remove(fruit);
    }

    public double getTotalCost() {
        return getTotalCost(basket);
    }

    public double getTotalCost(FruitArray fruitArray) {
        double totalCost = 0;
        for (int i = 0; i < fruitArray.size(); i++) {

            totalCost += fruitArray.get(i).getCost();
        }
        return totalCost;
    }

    public FruitArray getBasket() {
        return basket;
    }




}
