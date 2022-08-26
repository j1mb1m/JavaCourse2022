package by.itacademy.hw7.task3.controller;

import by.itacademy.hw7.task3.entity.Basket;
import by.itacademy.hw7.task3.entity.Fruit;
import by.itacademy.hw7.task3.view.BasketView;

public class BasketHandler {
    private BasketView basketView;

    public BasketHandler(BasketView view) {
        this.basketView = view;
    }

    public int countFruitInBasket(Basket basket) {
        return basket.countFruit();
    }

    public Fruit getFruit(Basket basket, int index) {
        return basket.getFruit(index);
    }

    public void addFruit(Basket basket, Fruit fruit) {
        basket.addFruit(fruit);
    }

    public void addFruit(Basket basket, Fruit[] fruits) {
        basket.addFruit(fruits);
    }

    public void clearBasket(Basket basket) {
        basket.clearBasket();
    }

    public void removeFruit(Basket basket, Fruit fruit) {
        basket.removeFruit(fruit);
    }

    public void removeFruit(Basket basket, int index) {
        basket.removeFruit(index);
    }

    public FruitArray getFruitArrayByType(Basket basket, String type) {
        FruitArray fruitArray = new FruitArray();
        for (int i = 0; i < basket.countFruit(); i++) {
            Fruit temp = basket.getFruit(i);
            if (temp.getType().equals(type)) {
                fruitArray.add(temp);
            }
        }
        return fruitArray;
    }

    public String[] getFruitType(Basket basket) {

        String[] tempArrayType = new String[basket.countFruit()];
        int countType = 0;
        for (int i = 0; i < basket.countFruit(); i++) {
            boolean found = false;
            for (int j = 0; j < countType; j++) {
                if (tempArrayType[j].equals(basket.getFruit(i).getType())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempArrayType[countType] = basket.getFruit(i).getType();
                countType++;
            }
        }
        String[] typeArray = new String[countType];
        for (int i = 0; i < countType; i++) {
            typeArray[i] = tempArrayType[i];
        }
        return typeArray;
    }

    public double getTotalCost(Basket basket) {
        return getTotalCost(basket, basket.getBasket());
    }

    public double getTotalCost(Basket basket, FruitArray fruitArray) {
        double totalCost = 0;
        for (int i = 0; i < fruitArray.size(); i++) {

            totalCost += fruitArray.get(i).getCost();
        }
        return totalCost;
    }

    public void printCostBasket(Basket basket) {
        basketView.printCostBasket(getTotalCost(basket));
    }

    public void printBasket(Basket basket) {
        basketView.printMessage(String.format("Корзина содержит %d ед. фруктов:  ", countFruitInBasket(basket)));

        for (int i = 0; i < basket.countFruit(); i++) {
            basketView.printMessage(basket.getFruit(i).toString());
        }
        basketView.printMessage("");
    }

    public void printCostBasketByTypeFruit(Basket basket) {
        String[] fruitType = getFruitType(basket);
        basketView.printMessage("Стоимость корзины в разрезе типов фруктов: ");
        for (String type : fruitType) {
            basketView.printCostBasketByTypeFruit(type, getTotalCost(basket, getFruitArrayByType(basket, type)));
        }
    }

}
