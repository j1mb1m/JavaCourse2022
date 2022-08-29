package by.itacademy.hw7.task3.service;

import by.itacademy.hw7.task3.entity.Basket;
import by.itacademy.hw7.task3.entity.fruit.Fruit;
import by.itacademy.hw7.task3.entity.array.FruitArray;

public interface BasketHandler {

    int countFruitInBasket(Basket basket);

    void addFruit(Basket basket, Fruit fruit);

    void addFruit(Basket basket, Fruit[] fruits);

    void clearBasket(Basket basket);

    void removeFruit(Basket basket, Fruit fruit);

    void removeFruit(Basket basket, int index);

    Fruit getFruit(Basket basket, int index);

    FruitArray getFruitArrayByType(Basket basket, String type);

    String[] getFruitType(Basket basket) ;

    double getTotalCost(Basket basket);

    double getTotalCost(FruitArray fruitArray);
}
