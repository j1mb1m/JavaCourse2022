package by.itacademy.hw20.task1.menu.command.user;

import by.itacademy.hw20.task1.menu.command.Commander;

public class GetServicesCommander extends Commander {

    public GetServicesCommander() {
        super("Get services");
    }

    @Override
    public void execute() {
        viewHandler.showAvailableServices();
    }
}
