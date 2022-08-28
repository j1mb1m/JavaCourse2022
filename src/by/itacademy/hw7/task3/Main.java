package by.itacademy.hw7.task3;

import by.itacademy.hw7.task3.service.BasketHandler;
import by.itacademy.hw7.task3.entity.*;
import by.itacademy.hw7.task3.view.BasketView;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket();
        BasketHandler basketHandler = new BasketHandler(new BasketView());
        basketHandler.addFruit(basket, new Fruit[]{new Apple(0.52, 10),
                new Apricot(1, 12),
                new Apple(0.54, 8.45),
                new Pear(5.5, 10)});
        basketHandler.printCostBasket(basket);
        basketHandler.printBasket(basket);
        basketHandler.printCostBasketByTypeFruit(basket);

        basketHandler.removeFruit(basket, 3);
        basketHandler.removeFruit(basket, basketHandler.getFruit(basket, 2));
        basketHandler.printCostBasket(basket);
        basketHandler.printBasket(basket);
        basketHandler.printCostBasketByTypeFruit(basket);

        basketHandler.clearBasket(basket);
        basketHandler.addFruit(basket, new Apple(0.52, 10));
        basketHandler.printCostBasket(basket);
        basketHandler.printBasket(basket);
        basketHandler.printCostBasketByTypeFruit(basket);


    }
}
