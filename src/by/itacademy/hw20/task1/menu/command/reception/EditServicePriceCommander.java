package by.itacademy.hw20.task1.menu.command.reception;

import by.itacademy.hw20.task1.exception.ServiceNotExistException;
import by.itacademy.hw20.task1.menu.command.Commander;
import by.itacademy.hw20.task1.model.hotel.Service;

import java.math.BigDecimal;

public class EditServicePriceCommander extends Commander {

    public EditServicePriceCommander() {
        super("Change the price of the service");
    }

    @Override
    public void execute() {

        try {
            long idService = Integer.parseInt(input.enterRoomNumber());
            execute(idService);

        } catch (NumberFormatException | ServiceNotExistException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }
    }

    public void execute(long idService) {

        Service service = servicesService.getService(idService);

        BigDecimal newPrice = input.enterBigDecimal("Enter the new price: ");
        servicesService.setPriceOfService(service, newPrice);

        viewHandler.print(String.format("New price for service \"%s\" - %s$", service.getName(), service.getPrice()));

    }
}
