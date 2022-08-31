package by.itacademy.hw7.task3.view;

import by.itacademy.hw7.task3.entity.Basket;
import by.itacademy.hw7.task3.service.BasketHandler;

public class BasketViewImpl implements BasketView {

    private final BasketHandler basketHandler;

    public BasketViewImpl(BasketHandler basketHandler) {
        this.basketHandler = basketHandler;
    }

    public void printCostBasket(Basket basket) {
        System.out.printf("Общая стоимость корзины: %s%n", basketHandler.getTotalCost(basket));
        System.out.println();
    }

    public void printBasket(Basket basket) {
        System.out.printf("Корзина содержит %d ед. фруктов:  %n", basketHandler.countFruitInBasket(basket));

        int count = basketHandler.countFruitInBasket(basket);

        for (int i = 0; i < count; i++) {
            System.out.println(basket.getBasket().get(i).toString());
        }
        System.out.println();
    }

    public void printCostBasketByTypeFruit(Basket basket) {
        String[] fruitType = basketHandler.getFruitType(basket);
        System.out.println("Стоимость корзины в разрезе типов фруктов: ");
        for (String type : fruitType) {
            System.out.printf("> %s стоимость %s %n", type, basketHandler.getTotalCost(basketHandler.getFruitArrayByType(basket, type)));
        }
    }
}
