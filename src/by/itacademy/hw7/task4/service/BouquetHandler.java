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
        for (int i = 0; i < bouquet.sizeBouquet(); i++) {
            cost += bouquet.getFlower(i).getPrice();
        }
        return cost;
    }

    public void addFlower(Bouquet bouquet, Flower flower) {
        bouquet.addFlower(flower);
    }

    public void addFlower(Bouquet bouquet, Flower[] flowers) {
        bouquet.addFlower(flowers);
    }

    public void clearBouquet(Bouquet bouquet) {
        bouquet.clearBouquet();
    }

    public void removeFlower(Bouquet bouquet, Flower flower) {
        bouquet.removeFlower(flower);
    }

    public void removeFlower(Bouquet bouquet, int index) {
        bouquet.removeFlower(index);
    }

    public Color[] getAllColors(Bouquet bouquet) {
        Color[] tempArrayColor = new Color[bouquet.sizeBouquet()];
        int count = 0;
        for (int i = 0; i < bouquet.sizeBouquet(); i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (tempArrayColor[j].equals(bouquet.getFlower(i).getColor())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempArrayColor[count] = bouquet.getFlower(i).getColor();
                count++;
            }
        }
        Color[] typeArray = new Color[count];
        for (int i = 0; i < count; i++) {
            typeArray[i] = tempArrayColor[i];
        }
        return typeArray;
    }

    public int getWiltingOfTheBouquet(Bouquet bouquet) {
        int maxDay = 0;
        for (int i = 0; i < bouquet.sizeBouquet(); i++) {
            maxDay = Math.max(bouquet.getFlower(i).getStorageDays(), maxDay);
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
