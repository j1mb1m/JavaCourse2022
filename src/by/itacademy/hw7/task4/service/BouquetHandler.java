package by.itacademy.hw7.task4.service;

import by.itacademy.hw7.task4.entity.Bouquet;
import by.itacademy.hw7.task4.entity.Color;
import by.itacademy.hw7.task4.entity.flower.Flower;

import java.util.Map;

public interface BouquetHandler {

    void addFlower(Bouquet bouquet, Flower flower);

    void addFlower(Bouquet bouquet, Flower[] flowers);

    void removeFlower(Bouquet bouquet, Flower flower);

    void removeFlower(Bouquet bouquet, int index);

    void clearBouquet(Bouquet bouquet);

    double getCost(Bouquet bouquet);

    int countFlowerInBouquet(Bouquet bouquet);

    Color[] getAllColors(Bouquet bouquet);

    String[] getAllFlowers(Bouquet bouquet);

    Map<String, Integer> getFlowerAndCount(Bouquet bouquet);

    int getWiltingOfTheBouquet(Bouquet bouquet);

}
