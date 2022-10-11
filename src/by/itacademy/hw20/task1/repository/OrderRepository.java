package by.itacademy.hw20.task1.repository;

import by.itacademy.hw20.task1.model.hotel.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private final List<Order> orders = new ArrayList<>();
    private static OrderRepository instance;

    public static OrderRepository getInstance() {
        if (instance == null) {
            instance = new OrderRepository();
        }
        return instance;
    }

    private OrderRepository() {
        init();
    }

    private void init() {
    }

    public List<Order> getOrders() {
        return orders;
    }
}
