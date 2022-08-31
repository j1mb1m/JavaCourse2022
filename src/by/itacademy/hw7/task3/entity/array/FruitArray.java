package by.itacademy.hw7.task3.entity.array;

import by.itacademy.hw7.task3.entity.fruit.Fruit;

import java.util.Arrays;

public class FruitArray {
    private Fruit[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

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
            System.arraycopy(array, 0, newArray, 0, size);
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
            if (size - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, size - 1 - index);
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
        return Arrays.copyOf(array, size);
    }
}
