package by.itacademy.hw8.task3.datasource;

import by.itacademy.hw8.task3.model.size.ClothingSize;
import by.itacademy.hw8.task3.model.size.ShoeSize;
import by.itacademy.hw8.task3.model.thing.*;

import by.itacademy.hw8.task3.model.*;

import java.util.ArrayList;
import java.util.List;

public class ThingDataSource {
    private final List<Thing> things = new ArrayList<>();
    private final List<Thing> orderedThings = new ArrayList<>();

    private final Color colorBlack = new Color("Черный");
    private final Color colorWhite = new Color("Белый");
    private final Color colorRed = new Color("Красный");
    private final Color colorBlue = new Color("Голубой");

    public ThingDataSource() {
        initData();
    }

    private void initData() {
        things.add(new Boots(ShoeSize.SIZE36, colorBlack, 87.5));
        things.add(new Boots(ShoeSize.SIZE38, colorRed, 120));
        things.add(new Dress(ClothingSize.L, colorBlack, 60));
        things.add(new Dress(ClothingSize.S, colorBlack, 60));
        things.add(new Dress(ClothingSize.M, colorBlack, 60));
        things.add(new Dress(ClothingSize.M, colorBlack, 60));
        things.add(new Jeans(ClothingSize.L, colorBlue, 85));
        things.add(new Jeans(ClothingSize.L, colorBlue, 85));
        things.add(new Jeans(ClothingSize.L, colorBlue, 85));
        things.add(new Jeans(ClothingSize.L, colorBlue, 85));
        things.add(new Jeans(ClothingSize.S, colorBlue, 85));
        things.add(new Jeans(ClothingSize.M, colorBlue, 85));
        things.add(new Shirt(ClothingSize.L, colorWhite, 60));
        things.add(new Shirt(ClothingSize.M, colorWhite, 60));
        things.add(new Shirt(ClothingSize.S, colorWhite, 60));
        things.add(new Sneakers(ShoeSize.SIZE36, colorWhite, 124.9));
        things.add(new Sneakers(ShoeSize.SIZE36, colorWhite, 124.9));
        things.add(new Sneakers(ShoeSize.SIZE36, colorWhite, 124.9));
        things.add(new Sneakers(ShoeSize.SIZE37, colorWhite, 124.9));
        things.add(new Sneakers(ShoeSize.SIZE38, colorWhite, 124.9));
        things.add(new Sneakers(ShoeSize.SIZE39, colorWhite, 124.9));
    }

    public List<Thing> getThings() {
        return things;
    }

    public List<Thing> getOrderedThings() {
        return orderedThings;
    }

}
