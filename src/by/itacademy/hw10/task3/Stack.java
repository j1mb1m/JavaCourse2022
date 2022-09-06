package by.itacademy.hw10.task3;

import java.util.EmptyStackException;

public class Stack<T extends Comparable<T>> {

    private Object[] elementData;
    private int elementCount;
    private int capacity;

    public Stack() {
        elementData = new Object[10];
        this.capacity = 10;
    }

    public T push(T item) {

        if (capacity == elementCount) {
            int newLength = (int) (1.5 * capacity);
            Object[] newElementData = new Object[newLength];
            if (capacity >= 0) System.arraycopy(elementData, 0, newElementData, 0, capacity);
            elementData = newElementData;
        }
        elementData[elementCount] = item;
        ++elementCount;

        return item;
    }

    public T pop() {

        if (elementCount == 0) throw new EmptyStackException();

        Object item = elementData[elementCount - 1];
        elementData[elementCount - 1] = null;
        --elementCount;

        return (T) item;
    }

    public T max() {

        T maxValue = (T) elementData[0];

        for (int i = 0; i < elementCount; i++) {
            T tempValue = (T)elementData[i];
            if (maxValue.compareTo(tempValue) < 0) {
                maxValue = tempValue;
            }
        }

        return maxValue;
    }

    public boolean empty() {
        return elementCount == 0;
    }

    public int size() {
        return elementCount;
    }

}
