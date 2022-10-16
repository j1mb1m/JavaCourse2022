package by.itacademy.hw20.task1.model.hotel;

import java.math.BigDecimal;

public class Service extends BaseModel{

    private static long counter = 1;
    private String name;

    private BigDecimal price;

    public Service(String name) {
        super(counter);
        this.name = name;
        this.price = new BigDecimal("0.00");
        counter++;
    }

    public Service(String name, BigDecimal price) {
        super(counter);
        this.name = name;
        this.price = price;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
