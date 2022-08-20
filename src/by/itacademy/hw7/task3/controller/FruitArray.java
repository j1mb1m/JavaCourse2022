package by.itacademy.hw7.task3.controller;

import by.itacademy.hw7.task3.entity.Fruit;

public class FruitArray {
    private Fruit[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 2;

    public FruitArray() {
        this.array = new Fruit[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public void add(Fruit fruit) {
        if (size == array.length) {
            int newLenght = (int) (1.5 * size);
            Fruit[] newArray = new Fruit[newLenght];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = fruit;
        size++;
    }

    public Fruit get(int index) {
        return array[index];
    }

    public void clear() {

        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public boolean remove(int index) {
        if (index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            return true;
        }
        return false;
    }

    public boolean remove(Fruit fruit) {
        for (int i = 0; i < size; i++) {
            if (fruit == null && array[i] == fruit) {
                return remove(i);
            } else if (array[i].equals(fruit)) {
                return remove(i);
            }
        }
        return false;
    }

    public Fruit[] getArray() {
        return array;
    }
}
