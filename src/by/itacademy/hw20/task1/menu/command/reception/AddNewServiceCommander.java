package by.itacademy.hw20.task1.menu.command.reception;

import by.itacademy.hw20.task1.exception.RoomExistException;
import by.itacademy.hw20.task1.menu.command.Commander;
import by.itacademy.hw20.task1.model.hotel.Service;

public class AddNewServiceCommander extends Commander {


    public AddNewServiceCommander() {
        super("Add a new service");

    }

    @Override
    public void execute() {

        try {
            String nameService = input.enterFromScanner("Enter the name of the new service");
            Service service = servicesService.addService(nameService);

            String command = input.enterFromScanner("Would you like to set the price for the service (Y/N)?");
            while (!(command.equalsIgnoreCase(YES) || command.equalsIgnoreCase(NO))) {
                command = input.enterFromScanner("");
            }

            if (command.equalsIgnoreCase(YES)) {
                new EditServicePriceCommander().execute(service.getId());
            }

        } catch (NumberFormatException | RoomExistException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }
    }
}
