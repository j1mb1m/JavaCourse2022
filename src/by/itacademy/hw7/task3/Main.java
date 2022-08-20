package by.itacademy.hw7.task3;

import by.itacademy.hw7.task3.controller.BasketController;
import by.itacademy.hw7.task3.entity.Apple;
import by.itacademy.hw7.task3.entity.Apricot;
import by.itacademy.hw7.task3.entity.Basket;
import by.itacademy.hw7.task3.entity.Pear;
import by.itacademy.hw7.task3.view.BasketConsoleView;

public class Main {
    public static void main(String[] args) {

        BasketController basketController = new BasketController(new Basket(), new BasketConsoleView());
        basketController.add(new Apple(0.52, 10),
                new Apricot(1, 12),
                new Apple(0.54, 8.45),
                new Pear(5.5, 10));
        basketController.printCostBasket();
        basketController.printBasket();
        basketController.printCostBasketByTypeFruit();
    }
}
