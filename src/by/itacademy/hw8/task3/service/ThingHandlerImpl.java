package by.itacademy.hw8.task3.service;

import by.itacademy.hw8.task3.datasource.ThingDataSource;
import by.itacademy.hw8.task3.model.Color;
import by.itacademy.hw8.task3.model.size.ClothingSize;
import by.itacademy.hw8.task3.model.size.ShoeSize;
import by.itacademy.hw8.task3.model.thing.Clothes;
import by.itacademy.hw8.task3.model.thing.Shoe;
import by.itacademy.hw8.task3.model.thing.Thing;
import by.itacademy.hw8.task3.view.statusbar.StatusBar;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class ThingHandlerImpl implements ThingHandler {

    private final StatusBar statusBar;

    public ThingHandlerImpl(StatusBar statusBar) {
        this.statusBar = statusBar;
    }

    /**
     * Searches for shoes by size
     *
     * @param thingDataSource - the source
     * @param size            - shoe size
     * @return array of things from the source
     */
    public List<Thing> search(ThingDataSource thingDataSource, ShoeSize size) {
        return search(thingDataSource.getThings(), size);
    }

    /**
     * Searches for shoes by size
     *
     * @param thingArray - source as array of things
     * @param size       - shoe size
     * @return array of things from the source
     */
    public List<Thing> search(List<Thing> thingArray, ShoeSize size) {
        statusBar.display(String.format("... выполняется поиск по размеру обуви '%s'", size.toString()));

        List<Thing> newThingArray = thingArray.stream()
                .filter(x -> x instanceof Shoe)
                .filter(x -> ((Shoe) x).getSize().equals(size))
                .collect(Collectors.toList());

        statusBar.display(String.format("найдено '%d' позиций", newThingArray.size()));
        return newThingArray;
    }

    /**
     * Searches for clothing by size
     *
     * @param thingDataSource - the source
     * @param size            - clothing size
     * @return array of things from the source
     */
    public List<Thing> search(ThingDataSource thingDataSource, ClothingSize size) {
        return search(thingDataSource.getThings(), size);
    }

    /**
     * Searches for clothing by size
     *
     * @param thingArray - the source as array of things
     * @param size       - clothing size
     * @return array of things from the source
     */
    public List<Thing> search(List<Thing> thingArray, ClothingSize size) {
        statusBar.display(String.format("... выполняется поиск по размеру одежды '%s'", size.toString()));
        List<Thing> newThingArray = thingArray.stream()
                .filter(x -> x instanceof Clothes)
                .filter(x -> ((Clothes) x).getSize().equals(size))
                .collect(Collectors.toList());

        statusBar.display(String.format("найдено '%d' позиций", newThingArray.size()));
        return newThingArray;
    }


    /**
     * Searches for things by color
     *
     * @param thingDataSource - the source
     * @param color           - the color of the thing
     * @return array of things from the source
     */
    public List<Thing> search(ThingDataSource thingDataSource, Color color) {
        return search(thingDataSource.getThings(), color);
    }

    /**
     * Searches for things by color
     *
     * @param thingArray - the source as array of things
     * @param color      - the color of the thing
     * @return array of things from the source
     */
    public List<Thing> search(List<Thing> thingArray, Color color) {

        statusBar.display(String.format("... выполняется поиск по цвету '%s'", color.toString()));
        List<Thing> newThingArray = thingArray.stream()
                .filter(x -> x.getColor().equals(color))
                .collect(Collectors.toList());

        statusBar.display(String.format("найдено '%d' позиций", newThingArray.size()));
        return newThingArray;

    }

    /**
     * Searches for things by type
     *
     * @param thingDataSource - the source as array of things
     * @param type            - type name of the thing
     * @return array of things from the source
     */
    public List<Thing> search(ThingDataSource thingDataSource, String type) {
        statusBar.display(String.format("... выполняется поиск по типу '%s'", type));

        List<Thing> thingArray = thingDataSource.getThings();
        List<Thing> newThingArray = thingArray.stream()
                .filter(x -> x.getName().equalsIgnoreCase(type))
                .collect(Collectors.toList());

        statusBar.display(String.format("найдено '%d' позиций", newThingArray.size()));
        return newThingArray;
    }

    /**
     * Searching for a thing by id
     *
     * @param thingDataSource - the source
     * @param id              - thing id
     * @return thing
     */
    public Thing search(ThingDataSource thingDataSource, int id) {

        try {
            Thing thing = thingDataSource.getThings().stream()
                    .filter(x -> x.getId() == id)
                    .findFirst()
                    .get();

            return thing;

        } catch (NoSuchElementException exception) {
            return null;
        }

    }

    @Override
    public double getCost(List<Thing> thingArray) {
        double cost = thingArray.stream()
                .map(x -> x.getPrice())
                .reduce(0d, (x, y) -> x + y);

        return cost;
    }

    /**
     * Ordering goods by the user
     *
     * @param thingDataSource - the source
     * @param idThing         - thing id
     * @return boolean (true - if the operation was successful otherwise false)
     */
    public boolean orderThing(ThingDataSource thingDataSource, int idThing) {

        Thing thing = search(thingDataSource, idThing);

        if (thing == null) {
            statusBar.display(String.format("Упс.. Товара с id='%d' нет в наличии..", idThing));
            return false;
        }

        thingDataSource.getThings().remove(thing);
        thingDataSource.getOrderedThings().add(thing);
        statusBar.display(String.format("Заказан товар : %s", thing));
        return true;
    }
}

