package by.itacademy.hw8.task3.service;

import by.itacademy.hw8.task3.datasource.ThingDataSource;
import by.itacademy.hw8.task3.model.Color;
import by.itacademy.hw8.task3.model.size.ClothingSize;
import by.itacademy.hw8.task3.model.size.ShoeSize;
import by.itacademy.hw8.task3.model.thing.Thing;

import java.util.List;

public interface ThingHandler {

    List<Thing> search(List<Thing> thingArray, ShoeSize size);

    List<Thing> search(List<Thing> thingArray, ClothingSize size);

    List<Thing> search(List<Thing> thingArray, Color color);

    List<Thing> search(ThingDataSource thingDataSource, String type);

    Thing search(ThingDataSource thingDataSource, int id);

    boolean orderThing(ThingDataSource thingDataSource, int idThing);

    double getCost(List<Thing> thingArray);

}
