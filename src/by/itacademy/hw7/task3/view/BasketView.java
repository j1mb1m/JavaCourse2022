package by.itacademy.hw7.task3.view;

import by.itacademy.hw7.task3.entity.Basket;
import by.itacademy.hw7.task3.entity.Fruit;

public class BasketView {

    public void printCostBasket(double totalCost) {
        System.out.printf("Общая стоимость корзины: %f%n", totalCost);
        System.out.println();
    }

    public void printBasket(Basket basket) {
        System.out.println("Корзина содержит: ");
        for (Fruit fruit : basket.getBasket().getArray()) {
            System.out.println(fruit.toString());
        }
        System.out.println();
    }

    public void printCostBasketByTypeFruit(String type, double cost) {
        System.out.printf("%s: стоимость %f%n", type, cost);
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
