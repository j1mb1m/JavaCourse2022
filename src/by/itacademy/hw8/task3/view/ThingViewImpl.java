package by.itacademy.hw8.task3.view;


import by.itacademy.hw8.task3.datasource.ThingDataSource;
import by.itacademy.hw8.task3.model.thing.Thing;
import by.itacademy.hw8.task3.service.ThingHandler;

import java.util.List;

public class ThingViewImpl implements ThingView {

    private final ThingHandler thingHandler;

    public ThingViewImpl(ThingHandler thingHandler) {
        this.thingHandler = thingHandler;
    }

    @Override
    public void printCost(List<Thing> thingArray) {

        double cost = thingHandler.getCost(thingArray);
        System.out.printf("Общая стоимость: %1.2f%n", cost);

    }

    @Override
    public void printCatalog(ThingDataSource thingDataSource) {

        System.out.println("Наличие в каталоге : ");
        thingDataSource.getThings().forEach(System.out::println);

    }

    @Override
    public void printCatalog(List<Thing> thingArray) {
        System.out.println("Найденные позиции : ");
        thingArray.forEach(System.out::println);
    }

    @Override
    public void printOrder(ThingDataSource thingDataSource) {
        System.out.println("Заказанные позиции : ");
        thingDataSource.getThings().forEach(System.out::println);
    }

}
