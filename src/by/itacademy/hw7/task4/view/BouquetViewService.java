package by.itacademy.hw7.task4.view;

import by.itacademy.hw7.task4.entity.Bouquet;
import by.itacademy.hw7.task4.entity.Color;

public interface BouquetViewService {

    void printCost(Bouquet bouquet);

    void printColors(Bouquet bouquet);

    void printFlowers(Bouquet bouquet);

    void printWiltingOfTheBouquet(Bouquet bouquet);

    void printFlowersAndTheirCount(Bouquet bouquet);
}
