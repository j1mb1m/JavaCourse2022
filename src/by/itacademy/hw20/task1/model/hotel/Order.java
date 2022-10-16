package by.itacademy.hw20.task1.model.hotel;

import by.itacademy.hw20.task1.model.users.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class Order extends BaseModel {

    private static long counter = 1;
    private final LocalDate date;
    private User user;
    private final RoomReservationRecord record;
    private final List<Service> services = new ArrayList<>();
    private final List<Payment> payments = new ArrayList<>();
    private boolean isPaid = false;

    public Order(User user, RoomReservationRecord record) {
        super(counter);
        this.date = LocalDate.now();
        this.user = user;
        this.record = record;
        counter++;
    }

    public LocalDate getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RoomReservationRecord getRecord() {
        return record;
    }

    public List<Service> getServices() {
        return services;
    }


    public BigDecimal getCost() {
        long daysBooking = DAYS.between(record.getStartBooking(), record.getEndBooking()) + 1;
        BigDecimal cost = record.getRoom().getPrice().multiply(new BigDecimal(daysBooking));

        for (Service service:services) {
            cost = cost.add(service.getPrice());
        }

        return cost;
    }

    public BigDecimal getToPay(){
        BigDecimal cost = getCost();

        for (Payment payment:payments) {
            cost = cost.subtract(payment.getSum());
        }

        return cost;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isPaid() {
        return isPaid;
    }

}
