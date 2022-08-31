package by.itacademy.hw7.task4.view;

import by.itacademy.hw7.task4.entity.Bouquet;
import by.itacademy.hw7.task4.entity.Color;
import by.itacademy.hw7.task4.service.BouquetHandler;

import java.util.Map;
import java.util.Set;

public class BouquetViewServiceImpl implements BouquetViewService {

    private final BouquetHandler bouquetHandler;

    public BouquetViewServiceImpl(BouquetHandler bouquetHandler) {
        this.bouquetHandler = bouquetHandler;
    }

    @Override
    public void printCost(Bouquet bouquet) {
        System.out.printf("Стоимость букета %s%n", bouquetHandler.getCost(bouquet));
    }

    @Override
    public void printColors(Bouquet bouquet) {
        Color[] colors = bouquetHandler.getAllColors(bouquet);

        System.out.println("Цвета в букете: ");
        for (Color color : colors) {
            System.out.printf("> %s%n", color.getName());
        }

    }

    @Override
    public void printFlowers(Bouquet bouquet) {
        String[] flowers = bouquetHandler.getAllFlowers(bouquet);

        System.out.println("Цветы в букете: ");
        for (String flower : flowers) {
            System.out.printf("> %s%n", flower);
        }
    }

    @Override
    public void printFlowersAndTheirCount(Bouquet bouquet) {
        Map<String, Integer> mapFlowers = bouquetHandler.getFlowerAndCount(bouquet);

        System.out.println("Цветы в букете: ");
        Set<Map.Entry<String, Integer>> entries = mapFlowers.entrySet();
        for (var pair : entries) {
            System.out.printf("> %s - %d штук%n", pair.getKey(), pair.getValue());
        }
    }

    @Override
    public void printWiltingOfTheBouquet(Bouquet bouquet) {
        System.out.printf("Букет завянет через %d дн.%n", bouquetHandler.getWiltingOfTheBouquet(bouquet));
    }

}
