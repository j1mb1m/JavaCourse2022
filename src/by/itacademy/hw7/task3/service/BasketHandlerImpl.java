package by.itacademy.hw7.task3.service;

import by.itacademy.hw7.task3.entity.Basket;
import by.itacademy.hw7.task3.entity.fruit.Fruit;
import by.itacademy.hw7.task3.entity.array.FruitArray;

public class BasketHandlerImpl implements BasketHandler {

    public int countFruitInBasket(Basket basket) {
        return basket.getBasket().size();
    }

    public Fruit getFruit(Basket basket, int index) {
        return basket.getBasket().get(index);
    }

    public void addFruit(Basket basket, Fruit fruit) {
        basket.getBasket().add(fruit);
    }

    public void addFruit(Basket basket, Fruit[] fruits) {
        for (Fruit fruit : fruits) {
            addFruit(basket, fruit);
        }
    }

    public void clearBasket(Basket basket) {
        basket.getBasket().clear();
    }

    public void removeFruit(Basket basket, Fruit fruit) {
        basket.getBasket().remove(fruit);
    }

    public void removeFruit(Basket basket, int index) {
        basket.getBasket().remove(index);
    }

    public FruitArray getFruitArrayByType(Basket basket, String type) {
        FruitArray fruitBasket = basket.getBasket();
        FruitArray fruitArray = new FruitArray();
        int countFruit = countFruitInBasket(basket);
        for (int i = 0; i < countFruit; i++) {
            Fruit temp = fruitBasket.get(i);
            if (temp.getType().equals(type)) {
                fruitArray.add(temp);
            }
        }
        return fruitArray;
    }

    public String[] getFruitType(Basket basket) {
        int countFruit = countFruitInBasket(basket);

        String[] tempArrayType = new String[countFruit];
        int countType = 0;
        for (int i = 0; i < countFruit; i++) {
            boolean found = false;
            for (int j = 0; j < countType; j++) {
                if (tempArrayType[j].equals(basket.getBasket().get(i).getType())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempArrayType[countType] = basket.getBasket().get(i).getType();
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
        return getTotalCost(basket.getBasket());
    }

    public double getTotalCost(FruitArray fruitArray) {
        double totalCost = 0;
        for (int i = 0; i < fruitArray.size(); i++) {

            totalCost += fruitArray.get(i).getCost();
        }
        return totalCost;
    }

}
