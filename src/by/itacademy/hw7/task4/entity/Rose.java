package by.itacademy.hw7.task4.entity;

public class Rose extends Flower {
    public Rose(Color color, double price, int storageDays) {
        super(color, price, storageDays);
        setType("Роза");
    }
}
