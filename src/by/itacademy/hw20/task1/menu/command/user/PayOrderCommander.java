package by.itacademy.hw20.task1.menu.command.user;

import by.itacademy.hw20.task1.service.UserSession;
import by.itacademy.hw20.task1.exception.IncorrectPaymentSumException;
import by.itacademy.hw20.task1.exception.OrderNotExistException;
import by.itacademy.hw20.task1.menu.command.Commander;
import by.itacademy.hw20.task1.model.hotel.Order;

import java.math.BigDecimal;
import java.util.List;

public class PayOrderCommander extends Commander {

    public PayOrderCommander() {
        super("Pay for orders");
    }

    @Override
    public void execute() {
        List<Order> orders = orderService.getUnpaidOrders(UserSession.getInstance().getCurrentUser());

        if (orders.isEmpty()) {
            viewHandler.print("All orders have been paid");
        } else {
            viewHandler.printOrder("Orders to be paid: ", orders);
        }
        try {
            long idOrder = input.enterNumber("Enter the order id: ");
            BigDecimal paymentAmount = input.enterBigDecimal("Enter the payment amount: ");

            Order order = orderService.getOrderById(idOrder);

            validation.validatePaymentSum(paymentAmount, order);
            orderService.PayOrder(order, paymentAmount);
            if (order.getToPay().compareTo(new BigDecimal(0)) == 0){
                String command = input.enterFromScanner("Close order (Y/N)?");
                while (!(command.equalsIgnoreCase(YES) || command.equalsIgnoreCase(NO))) {
                    command = input.enterFromScanner("");
                }
                if (command.equalsIgnoreCase(YES)) {
                    order.setPaid(true);
                }
            }

        } catch (NumberFormatException | IncorrectPaymentSumException | OrderNotExistException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }
        viewHandler.print("");
    }

}
