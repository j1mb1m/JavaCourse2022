package by.itacademy.hw7.task4.service;

import by.itacademy.hw7.task4.entity.Bouquet;
import by.itacademy.hw7.task4.entity.Color;
import by.itacademy.hw7.task4.entity.Flower;
import by.itacademy.hw7.task4.view.ViewService;

public class BouquetHandler {
    private ViewService viewService;

    public BouquetHandler(ViewService viewService) {
        this.viewService = viewService;
    }

    public double getCost(Bouquet bouquet) {
        double cost = 0;
        int count = countFruitInBasket(bouquet);

        for (int i = 0; i < count; i++) {
            cost += bouquet.getFlowerArray().get(i).getPrice();
        }
        return cost;
    }

    public int countFruitInBasket(Bouquet bouquet) {
        return bouquet.getFlowerArray().size();
    }

    public void addFlower(Bouquet bouquet, Flower flower) {
        bouquet.getFlowerArray().add(flower);
    }

    public void addFlower(Bouquet bouquet, Flower[] flowers) {
        for (Flower flower : flowers) {
            addFlower(bouquet, flower);
        }
    }

    public void clearBouquet(Bouquet bouquet) {
        bouquet.getFlowerArray().clear();
    }

    public void removeFlower(Bouquet bouquet, Flower flower) {
        bouquet.getFlowerArray().remove(flower);
    }

    public void removeFlower(Bouquet bouquet, int index) {
        bouquet.getFlowerArray().remove(index);
    }

    public Color[] getAllColors(Bouquet bouquet) {

        int countFlower = countFruitInBasket(bouquet);
        int countColor = 0;

        Color[] tempArrayColor = new Color[countFlower];

        for (int i = 0; i < countFlower; i++) {
            boolean found = false;
            for (int j = 0; j < countColor; j++) {
                if (tempArrayColor[j].equals(bouquet.getFlowerArray().get(i).getColor())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempArrayColor[countColor] = bouquet.getFlowerArray().get(i).getColor();
                countColor++;
            }
        }
        Color[] typeArray = new Color[countColor];
        for (int i = 0; i < countColor; i++) {
            typeArray[i] = tempArrayColor[i];
        }
        return typeArray;
    }

    public int getWiltingOfTheBouquet(Bouquet bouquet) {
        int maxDay = 0;
        int count = countFruitInBasket(bouquet);

        for (int i = 0; i < count; i++) {
            maxDay = Math.max(bouquet.getFlowerArray().get(i).getStorageDays(), maxDay);
        }
        return maxDay;
    }

    public void printCost(Bouquet bouquet) {
        viewService.printCost(getCost(bouquet));
    }

    public void printColors(Bouquet bouquet) {
        viewService.printColors(getAllColors(bouquet));
    }

    public void printWiltingOfTheBouquet(Bouquet bouquet) {
        viewService.printMessage(String.format("Букет завянет через %d дн.", getWiltingOfTheBouquet(bouquet)));
    }
}
