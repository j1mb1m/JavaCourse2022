package by.itacademy.hw7.task3.controller;

import by.itacademy.hw7.task3.entity.Basket;
import by.itacademy.hw7.task3.entity.Fruit;
import by.itacademy.hw7.task3.view.ViewImpl;
import by.itacademy.hw7.task4.entity.Flower;

public class BasketController {
    private Basket basket;
    private ViewImpl basketView;

    public BasketController(Basket basket, ViewImpl view) {
        this.basket = basket;
        this.basketView = view;
    }

    public Basket getBasket() {
        return basket;
    }

    public int countFruitInBasket() {
        return basket.size();
    }

    public Fruit getFruit(int index) {
        return basket.get(index);
    }

    public void addFruit(Fruit fruit) {
        basket.add(fruit);
    }

    public void addFruit(Fruit... fruits) {
        basket.add(fruits);
    }

    public void clearBasket() {
        basket.clear();
    }

    public void removeFruit(Fruit fruit) {
        basket.remove(fruit);
    }

    public FruitArray getFruitArrayByType(String type) {
        FruitArray fruitArray = new FruitArray();
        for (int i = 0; i < basket.size(); i++) {
            Fruit temp = basket.get(i);
            if (temp.getType().equals(type)) {
                fruitArray.add(temp);
            }
        }
        return fruitArray;
    }

    public String[] getFruitType() {

        String[] tempArrayType = new String[basket.size()];
        int countType = 0;
        for (int i = 0; i < basket.size(); i++) {
            boolean found = false;
            for (int j = 0; j < countType; j++) {
                if (tempArrayType[j].equals(basket.get(i).getType())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempArrayType[countType] = basket.get(i).getType();
                countType++;
            }
        }
        String[] typeArray = new String[countType];
        for (int i = 0; i < countType; i++) {
            typeArray[i] = tempArrayType[i];
        }
        return typeArray;
    }

    public double getTotalCost() {
        return getTotalCost(basket.getBasket());
    }

    public double getTotalCost(FruitArray fruitArray) {
        double totalCost = 0;
        for (int i = 0; i < fruitArray.size(); i++) {

            totalCost += fruitArray.get(i).getCost();
        }
        return totalCost;
    }

    public void printCostBasket() {
        basketView.printCostBasket(getTotalCost());
    }

    public void printBasket() {
        basketView.printMessage("Корзина содержит:  ");

        for (int i = 0; i < basket.size(); i++) {
            basketView.printMessage(basket.get(i).toString());
        }
        basketView.printMessage("");
    }

    public void printCostBasketByTypeFruit() {
        String[] fruitType = getFruitType();
        basketView.printMessage("Стоимость корзины в разрезе типов фруктов: ");
        for (String type : fruitType) {
            basketView.printCostBasketByTypeFruit(type, getTotalCost(getFruitArrayByType(type)));
        }
    }

}
