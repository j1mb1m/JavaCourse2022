package by.itacademy.hw20.task1.menu.command.user;

import by.itacademy.hw20.task1.menu.command.Commander;

public class UseServiceCommander extends Commander {

    public UseServiceCommander() {
        super("Use the service");
    }

    @Override
    public void execute() {
        try {
            long idOrder = input.enterNumber("Enter the order id: ");
            long idService = input.enterNumber("Enter the service id: ");

            orderService.addServiceInOrder(idOrder, idService);

        } catch (NumberFormatException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }
    }
}
