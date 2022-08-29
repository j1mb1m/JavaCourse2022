package by.itacademy.hw7.task4.service;

import by.itacademy.hw7.task4.entity.Bouquet;
import by.itacademy.hw7.task4.entity.Color;
import by.itacademy.hw7.task4.entity.flower.Flower;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BouquetHandlerImpl implements BouquetHandler {

    public double getCost(Bouquet bouquet) {
        double cost = 0;
        int count = countFlowerInBouquet(bouquet);

        for (int i = 0; i < count; i++) {
            cost += bouquet.getFlowerArray().get(i).getPrice();
        }
        return cost;
    }

    public int countFlowerInBouquet(Bouquet bouquet) {
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

        int countFlower = countFlowerInBouquet(bouquet);
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

        return Arrays.copyOf(tempArrayColor, countColor);
    }

    public String[] getAllFlowers(Bouquet bouquet) {

        int count= countFlowerInBouquet(bouquet);
        int countDifferentFlower = 0;

        String[] tempArrayFlower = new String[count];

        for (int i = 0; i < count; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (tempArrayFlower[j]!= null && tempArrayFlower[j].equalsIgnoreCase(bouquet.getFlowerArray().get(i).getType())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempArrayFlower[countDifferentFlower] = bouquet.getFlowerArray().get(i).getType();
                countDifferentFlower++;
            }
        }

        return Arrays.copyOf(tempArrayFlower, countDifferentFlower);
    }
    public Map<String, Integer> getFlowerAndCount(Bouquet bouquet){

        Map<String, Integer> flowersAndTheirCount = new HashMap<>();
        int count = countFlowerInBouquet(bouquet);

        for (int i = 0; i < count; i++) {
            if(flowersAndTheirCount.containsKey(bouquet.getFlowerArray().get(i).getType())){
                int tempCount = flowersAndTheirCount.get(bouquet.getFlowerArray().get(i).getType()).byteValue();
                flowersAndTheirCount.put(bouquet.getFlowerArray().get(i).getType(), tempCount+1);
            }
            else{
                flowersAndTheirCount.put(bouquet.getFlowerArray().get(i).getType(), 1);
            }
        }

        return flowersAndTheirCount;
    }
    public int getWiltingOfTheBouquet(Bouquet bouquet) {
        int maxDay = 0;
        int count = countFlowerInBouquet(bouquet);

        for (int i = 0; i < count; i++) {
            maxDay = Math.max(bouquet.getFlowerArray().get(i).getStorageDays(), maxDay);
        }
        return maxDay;
    }

}
