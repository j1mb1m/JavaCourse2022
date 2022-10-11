package by.itacademy.hw20.task1.view;

import by.itacademy.hw20.task1.model.hotel.Order;
import by.itacademy.hw20.task1.model.hotel.Room;
import by.itacademy.hw20.task1.model.hotel.RoomReservationRecord;
import by.itacademy.hw20.task1.model.hotel.Service;
import by.itacademy.hw20.task1.model.users.User;
import by.itacademy.hw20.task1.service.OrderService;
import by.itacademy.hw20.task1.service.ReservationService;
import by.itacademy.hw20.task1.service.ServicesService;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class ViewHandler {
    private final OrderService orderService = new OrderService();
    private final ServicesService servicesService = new ServicesService();
    private final ReservationService reservationService = new ReservationService();

    public void print(Object message) {
        System.out.println(message);
    }

    public void printProfile(User user) {
        print("=============== User profile ================");
        print(">> login              " + user.getLogin());
        print(">> registration date  " + user.getRegistrationDate());
        print(">> last authorization " + user.getLastAuthorizationDate());
        printOrder("All user orders:", orderService.getAllOrders(user));
        printDetailedOrder("Unpaid user orders:", orderService.getUnpaidOrders(user));
        print("");
    }

    public void printOrder(String msg, List<Order> orders) {
        if (!orders.isEmpty()) {
            print(msg);
            orders.forEach(order -> print(
                    String.format(">> Order №%s from %s: room №%s for the period %s - %s, total cost %s." +
                                    " To be paid %s$",
                            order.getId(),
                            order.getDate(),
                            order.getRecord().getRoom(),
                            order.getRecord().getStartBooking(),
                            order.getRecord().getEndBooking(),
                            order.getCost(),
                            order.getToPay())));
        }
    }

    public void printDetailedOrder(String msg, List<Order> orders) {
        if (!orders.isEmpty()) {
            print(msg);
            for (Order order : orders) {
                print(String.format(">> Order №%s from %s: room №%s for the period %s - %s, total cost %s$. " +
                                "To be paid %s$",
                        order.getId(),
                        order.getDate(),
                        order.getRecord().getRoom(),
                        order.getRecord().getStartBooking(),
                        order.getRecord().getEndBooking(),
                        order.getCost(),
                        order.getToPay()));
                if (!order.getServices().isEmpty()) {
                    print("     including:");
                    order.getServices().forEach(service -> print(String.format("     %s %s$", service.getName(), service.getPrice())));
                }
            }
        }
    }

    public void showAvailableServices() {
        List<Service> services = servicesService.getServices();
        if (services.isEmpty()) {
            print("Sorry, services are not available..");
        } else {
            print("Services available:");
            servicesService.getServices().forEach(e -> print(String.format(">%s: %s %s$", e.getId(), e.getName(), e.getPrice())));
            print("");
        }
    }

    public void showAvailableRooms(LocalDate dateStart, LocalDate dateEnd) {
        List<Room> rooms = reservationService.getFreeRooms(dateStart, dateEnd);

        if (rooms.isEmpty()) {
            print("There are no available rooms!");
        } else {
            print("Available rooms: ");
            rooms.forEach(this::print);
        }
        print("");
    }

    public void showRoomReservationRecords() {
        List<RoomReservationRecord> records = reservationService.getRoomReservationRecords();

        if (records.isEmpty()) {
            print("There are no booked rooms!");
        } else {
            print("Booked rooms: ");
            records.stream()
                    .sorted(Comparator.comparing(RoomReservationRecord::getStartBooking))
                    .forEach(this::print);
        }
        print("");
    }

}
