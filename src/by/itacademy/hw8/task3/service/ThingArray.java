package by.itacademy.hw8.task3.service;

import by.itacademy.hw8.task3.model.Thing;

/**
 * Создаем класс на подобии ArrayList, чтобы проще работать было с массивом
 */
public class ThingArray {
    private Thing[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public ThingArray() {
        this.array = new Thing[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public void add(Thing thing) {
        if (size == array.length) {
            int newLength = (int) (1.5 * size);
            Thing[] newArray = new Thing[newLength];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = thing;
        size++;
    }

    public Thing get(int index) {
        return array[index];
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

    public boolean remove(Thing thing) {
        for (int i = 0; i < size; i++) {
            if (thing == null && array[i] == thing) {
                return remove(i);
            } else if (array[i].equals(thing)) {
                return remove(i);
            }
        }
        return false;
    }

}
