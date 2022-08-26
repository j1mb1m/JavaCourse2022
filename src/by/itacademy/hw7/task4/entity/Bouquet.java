package by.itacademy.hw7.task4.entity;

import by.itacademy.hw7.task4.controller.FlowerArray;

public class Bouquet {
    private FlowerArray flowerArray;

    public Bouquet() {
        this.flowerArray = new FlowerArray();
    }

    public FlowerArray getFlowerArray() {
        return flowerArray;
    }

    public void addFlower(Flower[] flowers) {
        for (Flower flower : flowers) {
            addFlower(flower);
        }
    }

    public void addFlower(Flower flower) {
        flowerArray.add(flower);
    }

    public int sizeBouquet() {
        return flowerArray.size();
    }

    public Flower getFlower(int index) {
        return flowerArray.get(index);
    }

    public void clearBouquet() {
        flowerArray.clear();
    }

    public boolean removeFlower(Flower flower) {
        return flowerArray.remove(flower);
    }

    public boolean removeFlower(int index) {
        return flowerArray.remove(index);
    }
}
