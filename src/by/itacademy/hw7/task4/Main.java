package by.itacademy.hw7.task4;


import by.itacademy.hw7.task4.entity.flower.*;
import by.itacademy.hw7.task4.service.BouquetHandler;
import by.itacademy.hw7.task4.service.BouquetHandlerImpl;
import by.itacademy.hw7.task4.entity.*;
import by.itacademy.hw7.task4.view.BouquetViewService;
import by.itacademy.hw7.task4.view.BouquetViewServiceImpl;

public class Main {
    public static void main(String[] args) {

        Color red = new Color("Красный");
        Color yellow = new Color("Желтый");
        Color green = new Color("Зеленый");
        Color pink = new Color("Розовый");
        Color white = new Color("Белый");

        Bouquet bouquet = new Bouquet();
        BouquetHandler bouquetHandler = new BouquetHandlerImpl();
        BouquetViewService bouquetViewService = new BouquetViewServiceImpl(bouquetHandler);

        bouquetHandler.addFlower(bouquet, new Flower[]{new Rose(red, 3.5, 5),
                new Rose(red, 3.5, 5),
                new Eucalyptus(green, 3, 10),
                new Eucalyptus(green, 3, 10),
                new Eucalyptus(green, 3, 10),
                new Pion(pink, 4, 9),
                new Carnation(red, 2, 7),
                new Chamomile(yellow, 2.5, 11),
                new Rose(white, 5, 7),
                new Rose(red, 3.5, 5)});

        bouquetViewService.printColors(bouquet);
        bouquetViewService.printFlowersAndTheirCount(bouquet);
        bouquetViewService.printWiltingOfTheBouquet(bouquet);
        bouquetViewService.printCost(bouquet);

        System.out.println();

        bouquetHandler.removeFlower(bouquet, 5);
        bouquetHandler.removeFlower(bouquet, 1);
        bouquetViewService.printColors(bouquet);
        bouquetViewService.printWiltingOfTheBouquet(bouquet);
        bouquetViewService.printCost(bouquet);

        System.out.println();

        bouquetHandler.clearBouquet(bouquet);
        bouquetHandler.addFlower(bouquet, new Rose(red, 3.5, 5));
        bouquetHandler.addFlower(bouquet, new Rose(red, 3.5, 5));
        bouquetHandler.addFlower(bouquet, new Rose(red, 3.5, 5));
        bouquetViewService.printColors(bouquet);
        bouquetViewService.printFlowersAndTheirCount(bouquet);
        bouquetViewService.printWiltingOfTheBouquet(bouquet);
        bouquetViewService.printCost(bouquet);

    }
}
