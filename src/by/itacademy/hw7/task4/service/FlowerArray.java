package by.itacademy.hw7.task4.service;

import by.itacademy.hw7.task4.entity.Flower;

import java.util.Arrays;

public class FlowerArray {
    private Flower[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public FlowerArray() {
        this.array = new Flower[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public void add(Flower flower) {
        if (size == array.length) {
            int newLength = (int) (1.5 * size);
            Flower[] newArray = new Flower[newLength];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = flower;
        size++;
    }

    public Flower get(int index) {
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

    public boolean remove(Flower flower) {
        for (int i = 0; i < size; i++) {
            if (flower == null && array[i] == flower) {
                return remove(i);
            } else if (array[i].equals(flower)) {
                return remove(i);
            }
        }
        return false;
    }

    public Flower[] getArray() {
        return Arrays.copyOf(array, size);
    }
}
