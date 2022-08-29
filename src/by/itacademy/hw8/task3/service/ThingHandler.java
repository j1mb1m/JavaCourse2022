package by.itacademy.hw8.task3.service;

import by.itacademy.hw8.task3.datasource.ThingDataSource;
import by.itacademy.hw8.task3.model.*;

import java.util.List;
import java.util.stream.Collectors;

public class ThingHandler {

    /**
     * Searches for shoes by size
     *
     * @param thingDataSource - the source
     * @param size            - shoe size
     * @return array of things from the source
     */
    public List<Thing> findThingByShoeSize(ThingDataSource thingDataSource, ShoeSize size) {
        return findThingByShoeSize(thingDataSource.getThings(), size);
    }

    /**
     * Searches for shoes by size
     *
     * @param thingArray - source as array of things
     * @param size       - shoe size
     * @return array of things from the source
     */
    public List<Thing> findThingByShoeSize(List<Thing> thingArray, ShoeSize size) {
        System.out.printf("... выполняется поиск по размеру обуви '%s'%n", size.toString());
        List<Thing> newThingArray = thingArray.stream()
                .filter(x -> x instanceof Shoe)
                .filter(x -> ((Shoe) x).getSize().equals(size))
                .collect(Collectors.toList());
        System.out.printf("найдено '%d' позиций%n", newThingArray.size());
        return newThingArray;
    }

    /**
     * Searches for clothing by size
     *
     * @param thingDataSource - the source
     * @param size            - clothing size
     * @return array of things from the source
     */
    public List<Thing> findThingByClothingSize(ThingDataSource thingDataSource, ClothingSize size) {
        return findThingByClothingSize(thingDataSource.getThings(), size);
    }

    /**
     * Searches for clothing by size
     *
     * @param thingArray - the source as array of things
     * @param size       - clothing size
     * @return array of things from the source
     */
    public List<Thing> findThingByClothingSize(List<Thing> thingArray, ClothingSize size) {
        System.out.printf("... выполняется поиск по размеру одежды '%s'%n", size.toString());
        List<Thing> newThingArray = thingArray.stream()
                .filter(x -> x instanceof Clothes)
                .filter(x -> ((Clothes) x).getSize().equals(size))
                .collect(Collectors.toList());
        System.out.printf("найдено '%d' позиций%n", newThingArray.size());
        return newThingArray;
    }

    /**
     * Searches for things by color
     *
     * @param thingDataSource - the source
     * @param color           - the color of the thing
     * @return array of things from the source
     */
    public List<Thing> findThingByColor(ThingDataSource thingDataSource, Color color) {
        return findThingByColor(thingDataSource.getThings(), color);
    }

    /**
     * Searches for things by color
     *
     * @param thingArray - the source as array of things
     * @param color      - the color of the thing
     * @return array of things from the source
     */
    public List<Thing> findThingByColor(List<Thing> thingArray, Color color) {
        System.out.printf("... выполняется поиск по цвету '%s'%n", color.toString());
        List<Thing> newThingArray = thingArray.stream()
                .filter(x -> x.getColor().equals(color))
                .collect(Collectors.toList());
        System.out.printf("найдено '%d' позиций%n", newThingArray.size());
        return newThingArray;
    }

    /**
     * Searches for things by type
     *
     * @param thingDataSource - the source as array of things
     * @param type            - type name of the thing
     * @return array of things from the source
     */
    public List<Thing> findThingByType(ThingDataSource thingDataSource, String type) {
        System.out.printf("... выполняется поиск по типу '%s'%n", type);
        List<Thing> newThingArray = thingDataSource.getThings().stream()
                .filter(x -> x.getName().equalsIgnoreCase(type))
                .collect(Collectors.toList());
        System.out.printf("найдено '%d' позиций%n", newThingArray.size());
        return newThingArray;
    }

    /**
     * Ordering goods by the user
     *
     * @param thingDataSource - the source
     * @param idThing         - thing id
     * @return boolean (true - if the operation was successful otherwise false)
     */
    public boolean orderThing(ThingDataSource thingDataSource, int idThing) {
        Thing thing = findThingById(thingDataSource, idThing);
        if (thing == null) {
            System.out.printf("Упс.. Товара с id='%d' нет в наличии..%n", idThing);
            return false;
        }

        thingDataSource.getThings().remove(thing);
        thingDataSource.getOrderedThings().add(thing);
        System.out.printf("Заказан товар : %s%n", thing);
        return true;
    }

    /**
     * Searching for a thing by id
     *
     * @param thingDataSource - the source
     * @param id              - thing id
     * @return thing
     */
    private Thing findThingById(ThingDataSource thingDataSource, int id) {
        try {
            return thingDataSource.getThings().stream()
                    .filter(x -> x.getId() == id)
                    .findFirst()
                    .get();
        } catch (Exception e) {
            return null;
        }
    }

    public void printCost(List<Thing> thingArray) {
        double cost = thingArray.stream().map(x -> x.getPrice()).reduce(0d, (x, y) -> x + y);
        System.out.printf("Общая стоимость: %1.2f%n", cost);
    }

    public void printCatalog(ThingDataSource thingDataSource) {
        System.out.println("Наличие в каталоге : ");
        thingDataSource.getThings().forEach(x -> System.out.println(x));
    }

    public void printCatalog(List<Thing> thingArray) {
        System.out.println("Найденные позиции : ");
        thingArray.forEach(x -> System.out.println(x));
    }

    public void printOrder(ThingDataSource thingDataSource) {
        System.out.println("Заказанные позиции : ");
        thingDataSource.getOrderedThings().forEach(x -> System.out.println(x));
    }
}

