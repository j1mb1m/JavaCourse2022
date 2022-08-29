package by.itacademy.hw8.task3.datasource;

import by.itacademy.hw8.task3.model.*;

import java.util.ArrayList;
import java.util.List;

public class ThingDataSource {
    private final List<Thing> things = new ArrayList<>();
    private final List<Thing> orderedThings = new ArrayList<>();

    private final Color COLOR_BLACK = new Color("Черный");
    private final Color COLOR_WHITE = new Color("Белый");
    private final Color COLOR_RED = new Color("Красный");
    private final Color COLOR_BLUE = new Color("Голубой");

    public ThingDataSource() {
        initData();
    }

    private void initData() {
        things.add(new Boots(ShoeSize.SIZE36, COLOR_BLACK, 87.5));
        things.add(new Boots(ShoeSize.SIZE38, COLOR_RED, 120));
        things.add(new Dress(ClothingSize.L, COLOR_BLACK, 60));
        things.add(new Dress(ClothingSize.S, COLOR_BLACK, 60));
        things.add(new Dress(ClothingSize.M, COLOR_BLACK, 60));
        things.add(new Dress(ClothingSize.M, COLOR_BLACK, 60));
        things.add(new Jeans(ClothingSize.L, COLOR_BLUE, 85));
        things.add(new Jeans(ClothingSize.L, COLOR_BLUE, 85));
        things.add(new Jeans(ClothingSize.L, COLOR_BLUE, 85));
        things.add(new Jeans(ClothingSize.L, COLOR_BLUE, 85));
        things.add(new Jeans(ClothingSize.S, COLOR_BLUE, 85));
        things.add(new Jeans(ClothingSize.M, COLOR_BLUE, 85));
        things.add(new Shirt(ClothingSize.L, COLOR_WHITE, 60));
        things.add(new Shirt(ClothingSize.M, COLOR_WHITE, 60));
        things.add(new Shirt(ClothingSize.S, COLOR_WHITE, 60));
        things.add(new Sneakers(ShoeSize.SIZE36, COLOR_WHITE, 124.9));
        things.add(new Sneakers(ShoeSize.SIZE36, COLOR_WHITE, 124.9));
        things.add(new Sneakers(ShoeSize.SIZE36, COLOR_WHITE, 124.9));
        things.add(new Sneakers(ShoeSize.SIZE37, COLOR_WHITE, 124.9));
        things.add(new Sneakers(ShoeSize.SIZE38, COLOR_WHITE, 124.9));
        things.add(new Sneakers(ShoeSize.SIZE39, COLOR_WHITE, 124.9));
    }

    public List<Thing> getThings() {
        return things;
    }

    public List<Thing> getOrderedThings() {
        return orderedThings;
    }
}
