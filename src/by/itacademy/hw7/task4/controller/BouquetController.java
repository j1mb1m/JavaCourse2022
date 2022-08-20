package by.itacademy.hw7.task4.controller;

import by.itacademy.hw7.task4.entity.Bouquet;
import by.itacademy.hw7.task4.entity.Color;
import by.itacademy.hw7.task4.entity.Flower;
import by.itacademy.hw7.task4.view.ViewServiceImpl;

public class BouquetController {
    private Bouquet bouquet;
    private ViewServiceImpl viewService;

    public BouquetController(Bouquet bouquet, ViewServiceImpl viewService) {
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

    public void add(Flower flower) {
        bouquet.add(flower);
    }

    public void add(Flower... flowers) {
        bouquet.add(flowers);
    }

    public void clear() {
        bouquet.clear();
    }

    public void remove(Flower flower) {
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
