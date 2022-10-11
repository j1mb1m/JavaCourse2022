package by.itacademy.hw20.task1.menu.command.login;

import by.itacademy.hw20.task1.menu.command.Commander;
import by.itacademy.hw20.task1.service.UserSession;

public class ExitCommander extends Commander {

    public ExitCommander() {
        super("Exit");
    }

    @Override
    public void execute() {
        viewHandler.print("The work is completed");
        UserSession.getInstance().cleanUserSession();
        System.exit(0);
    }
}
