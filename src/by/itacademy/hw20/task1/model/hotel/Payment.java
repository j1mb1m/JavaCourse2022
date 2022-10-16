package by.itacademy.hw20.task1.model.hotel;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payment extends BaseModel{

    private static long counter = 1;
    private final LocalDate date;
    private final Order order;
    private final BigDecimal sum;

    public Payment(Order order, BigDecimal sum) {
        super(counter);
        this.order = order;
        this.date = LocalDate.now();
        this.sum = sum;
        counter++;
    }

    public BigDecimal getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Payment №" + getId() +
                " from " + date +
                ": order=" + order +
                " sum=" + sum;
    }
}
