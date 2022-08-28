package by.itacademy.hw9.task2;

public class Pair <T, V>{
    private T firstElement;
    private V secondElement;

    public Pair(T t, V v) {
        this.firstElement = t;
        this.secondElement = v;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(T firstElement) {
        this.firstElement = firstElement;
    }

    public V getSecondElement() {
        return secondElement;
    }

    public void setSecondElement(V secondElement) {
        this.secondElement = secondElement;
    }

    public Pair<V,T> swapFirstAndSecondElements(){
        return new Pair<>(secondElement, firstElement);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first element=" + firstElement +
                ", second element=" + secondElement +
                '}';
    }
}
