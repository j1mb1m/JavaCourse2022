package by.itacademy.hw20.task1.model.hotel;

import java.math.BigDecimal;
import java.util.Objects;

public class Room {

    private int number;
    private BigDecimal price;

    public Room(int number) {
        this.number = number;
        this.price = new BigDecimal("0.00");
    }

    public Room(int number, BigDecimal price) {
        this.number = number;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Room №%s, price %s$", number, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return number == room.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
