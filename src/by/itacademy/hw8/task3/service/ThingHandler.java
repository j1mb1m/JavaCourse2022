package by.itacademy.hw8.task3.service;

import by.itacademy.hw8.task3.datasource.ThingDataSource;
import by.itacademy.hw8.task3.model.*;

public class ThingHandler {

    /**
     * Searches for shoes by size
     * @param thingDataSource - the source
     * @param size - shoe size
     * @return array of things from the source
     */
    public ThingArray findThingByShoeSize(ThingDataSource thingDataSource, ShoeSize size) {
        return findThingByShoeSize(thingDataSource.getThings(), size);
    }

    /**
     * Searches for shoes by size
     * @param thingArray - source as array of things
     * @param size - shoe size
     * @return array of things from the source
     */
    public ThingArray findThingByShoeSize(ThingArray thingArray, ShoeSize size) {
        System.out.printf("... выполняется поиск по размеру обуви '%s'%n", size.toString());
         ThingArray newThingArray = new ThingArray();
        for (int i = 0; i < thingArray.size(); i++) {

            if (thingArray.get(i) instanceof Shoe shoe) {
                if (shoe.getSize().equals(size)) {
                    newThingArray.add(shoe);
                }
            }

        }
        System.out.printf("найдено '%d' позиций%n", newThingArray.size());
        return newThingArray;
    }

    /**
     * Searches for clothing by size
     * @param thingDataSource - the source
     * @param size - clothing size
     * @return array of things from the source
     */
    public ThingArray findThingByClothingSize(ThingDataSource thingDataSource, ClothingSize size) {
        return findThingByClothingSize(thingDataSource.getThings(), size);
    }

    /**
     * Searches for clothing by size
     * @param thingArray - the source as array of things
     * @param size - clothing size
     * @return array of things from the source
     */
    public ThingArray findThingByClothingSize(ThingArray thingArray, ClothingSize size) {
        System.out.printf("... выполняется поиск по размеру одежды '%s'%n", size.toString());
        ThingArray newThingArray = new ThingArray();

        for (int i = 0; i < thingArray.size(); i++) {

            if (thingArray.get(i) instanceof Clothes clothes) {
                if (clothes.getSize().equals(size)) {
                    newThingArray.add(clothes);
                }
            }

        }

        System.out.printf("найдено '%d' позиций%n", newThingArray.size());
        return newThingArray;
    }

    /**
     * Searches for things by color
     *
     * @param thingDataSource - the source
     * @param color - the color of the thing
     * @return array of things from the source
     */
    public ThingArray findThingByColor(ThingDataSource thingDataSource, Color color) {
        return findThingByColor(thingDataSource.getThings(), color);
    }

    /**
     * Searches for things by color
     *
     * @param thingArray - the source as array of things
     * @param color - the color of the thing
     * @return array of things from the source
     */
    public ThingArray findThingByColor(ThingArray thingArray, Color color) {
        System.out.printf("... выполняется поиск по цвету '%s'%n", color.toString());
        ThingArray newThingArray = new ThingArray();
        for (int i = 0; i < thingArray.size(); i++) {

            if (thingArray.get(i).getColor().equals(color)) {
                newThingArray.add(thingArray.get(i));
            }

        }
        System.out.printf("найдено '%d' позиций%n", newThingArray.size());
        return newThingArray;
    }

    /**
     * Searches for things by type
     *
     * @param thingDataSource - the source as array of things
     * @param type - type name of the thing
     * @return array of things from the source
     */
    public ThingArray findThingByType(ThingDataSource thingDataSource, String type) {
        System.out.printf("... выполняется поиск по типу '%s'%n", type);
        ThingArray newThingArray = new ThingArray();
        ThingArray thingArray = thingDataSource.getThings();
        for (int i = 0; i < thingArray.size(); i++) {

            if (thingArray.get(i).getName().equalsIgnoreCase(type)) {
                newThingArray.add(thingArray.get(i));
            }

        }
        System.out.printf("найдено '%d' позиций%n", newThingArray.size());
        return newThingArray;
    }

    /**
     * Ordering goods by the user
     * @param thingDataSource - the source
     * @param idThing - thing id
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
     * @param thingDataSource - the source
     * @param id - thing id
     * @return thing
     */
    private Thing findThingById(ThingDataSource thingDataSource, int id) {
        //здесь можно было реализовать бинарный поиск. т.к. сортировать список не будем
        ThingArray thingArray = thingDataSource.getThings();
        for (int i = 0; i < thingArray.size(); i++) {
            if (thingArray.get(i).getId() == id) return thingArray.get(i);
        }
        return null;
    }

    public void printCost(ThingArray thingArray) {
        double cost = 0;

        for (int i = 0; i < thingArray.size(); i++) cost += thingArray.get(i).getPrice();

        System.out.printf("Общая стоимость: %1.2f%n", cost);
    }

    public void printCatalog(ThingDataSource thingDataSource) {
        System.out.println("Наличие в каталоге : ");
        ThingArray thingArray = thingDataSource.getThings();
        for (int i = 0; i < thingArray.size(); i++) {
            System.out.println(thingArray.get(i).toString());
        }
    }

    public void printCatalog(ThingArray thingArray) {
        System.out.println("Найденные позиции : ");
        for (int i = 0; i < thingArray.size(); i++) {
            System.out.println(thingArray.get(i).toString());
        }
    }

    public void printOrder(ThingDataSource thingDataSource) {
        System.out.println("Заказанные позиции : ");
        ThingArray thingArray = thingDataSource.getOrderedThings();
        for (int i = 0; i < thingArray.size(); i++) {
            System.out.println(thingArray.get(i).toString());
        }
    }
}

