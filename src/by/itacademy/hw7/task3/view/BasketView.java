package by.itacademy.hw7.task3.view;

import by.itacademy.hw7.task3.entity.Basket;
import by.itacademy.hw7.task3.entity.Fruit;

public class BasketView {

    public void printCostBasket(double totalCost) {
        System.out.printf("Общая стоимость корзины: %f%n", totalCost);
        System.out.println();
    }

    public void printBasket(Basket basket, int countFruit) {
        System.out.printf("Корзина содержит %d ед. фруктов:  %n", countFruit);


        for (int i = 0; i < countFruit; i++) {
            printMessage(basket.getBasket().get(i).toString());
        }
        printMessage("");
    }

    public void printCostBasketByTypeFruit(String type, double cost) {
        System.out.printf("%s: стоимость %f%n", type, cost);
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
