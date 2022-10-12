package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.exception.order.OrderNotExistException;
import by.itacademy.hw20.task1.model.hotel.Order;
import by.itacademy.hw20.task1.model.hotel.Payment;
import by.itacademy.hw20.task1.model.hotel.RoomReservationRecord;
import by.itacademy.hw20.task1.model.users.User;
import by.itacademy.hw20.task1.repository.OrderRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class OrderService {

    private final OrderRepository repository = OrderRepository.getInstance();
    private final ServicesService servicesService = new ServicesService();

    public Order createOrder(User user, RoomReservationRecord record){
        Order order = new Order(user, record);
        repository.getOrders().add(order);

        return order;
    }

    public void PayOrder(Order order, BigDecimal sum){
        order.getPayments().add(new Payment(order, sum));
    }

     public void addServiceInOrder(long idOrder, long idService){
       Order order = getOrderById(idOrder);
       order.getServices().add(servicesService.getService(idService));
    }

    public Order getOrderById(long idOrder){
        List<Order> orderList = repository.getOrders().stream()
                .filter(order -> order.getId() == idOrder)
                .limit(1)
                .collect(Collectors.toList());

        if (orderList.isEmpty()){
            throw new OrderNotExistException("ERROR!! The order is not found");
        }

        Order order = orderList.get(0);

        if (order.isPaid()){
            throw new RuntimeException("ERROR!! The order was closed");
        }

        return order;
    }

    public List<Order> getUnpaidOrders(User user){

        return repository.getOrders().stream()
               .filter(order -> !order.isPaid() && order.getUser().equals(user))
               .collect(Collectors.toList());
    }

    public List<Order> getAllOrders(User user){

        return repository.getOrders().stream()
                .filter(order -> order.getUser().equals(user))
                .collect(Collectors.toList());
    }



}
