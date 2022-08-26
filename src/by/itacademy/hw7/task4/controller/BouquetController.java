package by.itacademy.hw7.task4.controller;

import by.itacademy.hw7.task4.entity.Bouquet;
import by.itacademy.hw7.task4.entity.Color;
import by.itacademy.hw7.task4.entity.Flower;
import by.itacademy.hw7.task4.view.ViewService;

public class BouquetController {
    private Bouquet bouquet;
    private ViewService viewService;

    public BouquetController(Bouquet bouquet, ViewService viewService) {
        this.bouquet = bouquet;
        this.viewService = viewService;
    }

    public double getCost() {
        double cost = 0;
        for (int i = 0; i < bouquet.size(); i++) {
            cost += bouquet.get(i).getPrice();
        }
        return cost;
    }

    public void addFlower(Flower flower) {
        bouquet.add(flower);
    }

    public void addFlower(Flower... flowers) {
        bouquet.add(flowers);
    }

    public void clearBouquet() {
        bouquet.clear();
    }

    public void removeFlower(Flower flower) {
        bouquet.remove(flower);
    }

    public Color[] getAllColors() {
        Color[] tempArrayColor = new Color[bouquet.size()];
        int count = 0;
        for (int i = 0; i < bouquet.size(); i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (tempArrayColor[j].equals(bouquet.get(i).getColor())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempArrayColor[count] = bouquet.get(i).getColor();
                count++;
            }
        }
        Color[] typeArray = new Color[count];
        for (int i = 0; i < count; i++) {
            typeArray[i] = tempArrayColor[i];
        }
        return typeArray;
    }

    public int getWiltingOfTheBouquet() {
        int maxDay = 0;
        for (int i = 0; i < bouquet.size(); i++) {
            maxDay = Math.max(bouquet.get(i).getStorageDays(), maxDay);
        }
        return maxDay;
    }

    public void printCost() {
        viewService.printCost(getCost());
    }

    public void printColors() {
        viewService.printColors(getAllColors());
    }

    public void printWiltingOfTheBouquet() {
        viewService.printMessage("Букет завянет через " + getWiltingOfTheBouquet() + " дн.");
    }
}
