package by.itacademy.hw7.task3.view;

import by.itacademy.hw7.task3.controller.FruitArray;
import by.itacademy.hw7.task3.entity.Basket;
import by.itacademy.hw7.task3.entity.Fruit;

public interface BasketView {
    void printCostBasket(double cost);
    void printBasket(Basket basket);
    void printCostBasketByTypeFruit(String type, double cost);
    void printMessage(String msg);
}
