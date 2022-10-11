package by.itacademy.hw20.task1.menu.command.login;

import by.itacademy.hw20.task1.service.UserSession;
import by.itacademy.hw20.task1.menu.command.Commander;

public class LogoutCommander extends Commander {

    public LogoutCommander() {
        super("Logout");
    }

    @Override
    public void execute() {
        viewHandler.print("The user logout");
        UserSession.getInstance().cleanUserSession();
    }
}
