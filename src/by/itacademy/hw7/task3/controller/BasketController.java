package by.itacademy.hw7.task3.controller;

import by.itacademy.hw7.task3.entity.Basket;
import by.itacademy.hw7.task3.entity.Fruit;
import by.itacademy.hw7.task3.view.View;

public class BasketController {
    private Basket basket;
    private View basketView;

    public BasketController(Basket basket, View view) {
        this.basket = basket;
        this.basketView = view;
    }

    public Basket getBasket() {
        return basket;
    }

    public FruitArray getFruitByType(String type) {
        FruitArray fruitArray = new FruitArray();
        FruitArray fruitBasket = basket.getBasket();
        for (int i = 0; i < fruitBasket.size(); i++) {
            Fruit temp = fruitBasket.get(i);
            if (temp.getType().equals(type)) {
                fruitArray.add(temp);
            }
        }
        return fruitArray;
    }

    public String[] getFruitType() {
        FruitArray fruitBasket = basket.getBasket();
        String[] tempArrayType = new String[fruitBasket.size()];
        int countType = 0;
        for (int i = 0; i < fruitBasket.size(); i++) {
            boolean found = false;
            for (int j = 0; j < countType; j++) {
                if (tempArrayType[j].equals(fruitBasket.get(i).getType())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempArrayType[countType] = fruitBasket.get(i).getType();
                countType++;
            }
        }
        String[] typeArray = new String[countType];
        for (int i = 0; i < countType; i++) {
            typeArray[i] = tempArrayType[i];
        }
        return typeArray;
    }

    public void printCostBasket(){
        basketView.printCostBasket(basket.getTotalCost());
    }
    public void printBasket(){
        basketView.printMessage("Корзина содержит:  ");

        for (Fruit fruit : basket.getBasket().getArray()) {
            basketView.printMessage(fruit.toString());
        }
        basketView.printMessage("");
    }

    public void printCostBasketByTypeFruit(){
        String[] fruitType = getFruitType();
        basketView.printMessage("Стоимость корзины в разрезе типов фруктов: ");
        for (String type : fruitType) {
            basketView.printCostBasketByTypeFruit(type, basket.getTotalCost(getFruitByType(type)));
        }
    }

}
