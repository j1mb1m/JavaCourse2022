package by.itacademy.hw8.task3.view;

import by.itacademy.hw8.task3.datasource.ThingDataSource;
import by.itacademy.hw8.task3.model.thing.Thing;

import java.util.List;

public interface ThingView {

    void printCost(List<Thing> thingArray);

    void printCatalog(ThingDataSource thingDataSource);

    void printCatalog(List<Thing> thingArray);

    void printOrder(ThingDataSource thingDataSource);

}
