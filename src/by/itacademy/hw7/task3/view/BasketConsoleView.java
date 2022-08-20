package by.itacademy.hw7.task3.view;

import by.itacademy.hw7.task3.controller.BasketController;
import by.itacademy.hw7.task3.controller.FruitArray;
import by.itacademy.hw7.task3.entity.*;

public class BasketConsoleView implements View{

    @Override
    public void printCostBasket(double totalCost) {
        System.out.println("Общая стоимость корзины: " + totalCost);
        System.out.println();
    }

    @Override
    public void printBasket(Basket basket) {
        System.out.println("Корзина содержит: ");
        for (Fruit fruit : basket.getBasket().getArray()) {
            System.out.println(fruit.toString());
        }
        System.out.println();
    }

    @Override
    public void printCostBasketByTypeFruit(String type, double cost) {
        System.out.println(type + ": стоимость " + cost);
    }
    @Override
    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
