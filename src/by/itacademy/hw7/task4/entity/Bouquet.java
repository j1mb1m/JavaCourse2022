package by.itacademy.hw7.task4.entity;

import by.itacademy.hw7.task3.entity.Fruit;
import by.itacademy.hw7.task4.controller.FlowerArray;

public class Bouquet {
    private FlowerArray flowerArray;

    public Bouquet() {
        this.flowerArray = new FlowerArray();
    }

    public FlowerArray getFlowerArray() {
        return flowerArray;
    }
    public void add(Flower... flowers) {
        for (Flower flower : flowers) {
            add(flower);
        }
    }

    public void add(Flower flower) {
        flowerArray.add(flower);
    }

    public int size() {
        return flowerArray.size();
    }
    public Flower get(int index) {
        return flowerArray.get(index);
    }

    public void clear() {
        flowerArray.clear();
    }

    public void remove(Flower flower) {
        flowerArray.remove(flower);
    }

}
