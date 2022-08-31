package by.itacademy.hw7.task3;

import by.itacademy.hw7.task3.entity.*;
import by.itacademy.hw7.task3.entity.fruit.Apple;
import by.itacademy.hw7.task3.entity.fruit.Apricot;
import by.itacademy.hw7.task3.entity.fruit.Fruit;
import by.itacademy.hw7.task3.entity.fruit.Pear;
import by.itacademy.hw7.task3.service.BasketHandler;
import by.itacademy.hw7.task3.service.BasketHandlerImpl;
import by.itacademy.hw7.task3.view.BasketView;
import by.itacademy.hw7.task3.view.BasketViewImpl;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket();
        BasketHandler basketHandler = new BasketHandlerImpl();
        BasketView basketView = new BasketViewImpl(basketHandler);

        basketHandler.addFruit(basket, new Fruit[]{new Apple(0.52, 10),
                new Apricot(1, 12),
                new Apple(0.54, 8.45),
                new Pear(5.5, 10)});
        basketView.printCostBasket(basket);
        basketView.printBasket(basket);
        basketView.printCostBasketByTypeFruit(basket);

        basketHandler.removeFruit(basket, 3);
        basketHandler.removeFruit(basket, basketHandler.getFruit(basket, 2));
        basketView.printCostBasket(basket);
        basketView.printBasket(basket);
        basketView.printCostBasketByTypeFruit(basket);

        basketHandler.clearBasket(basket);
        basketHandler.addFruit(basket, new Apple(0.52, 10));
        basketView.printCostBasket(basket);
        basketView.printBasket(basket);
        basketView.printCostBasketByTypeFruit(basket);


    }
}
