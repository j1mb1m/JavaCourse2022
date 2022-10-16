package by.itacademy.hw20.task1.menu.command;

import by.itacademy.hw20.task1.service.*;
import by.itacademy.hw20.task1.view.ViewHandler;

public abstract class Commander {

    protected final String YES = "Y";
    protected final String NO = "N";

    protected InputFromScanner input = new InputFromScanner();
    protected DataValidation validation = new DataValidation();
    protected UserService userService = new UserService();
    protected RoomService roomService = new RoomService();
    protected ReservationService reservationService = new ReservationService();
    protected OrderService orderService = new OrderService();
    protected ServicesService servicesService = new ServicesService();
    protected ViewHandler viewHandler = new ViewHandler();
    protected String commandName;

    public Commander(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

    public void execute(){}

    public void repeat(){

        String command = input.enterFromScanner("Try again (Y/N)?");
        while (!(command.equalsIgnoreCase(YES) || command.equalsIgnoreCase(NO))) {
            command = input.enterFromScanner("");
        }
        if (command.equalsIgnoreCase(YES)) {
            execute();
        }
    }


}
