package by.itacademy.hw20.task1.menu.command.user;

import by.itacademy.hw20.task1.service.UserSession;
import by.itacademy.hw20.task1.menu.command.Commander;
import by.itacademy.hw20.task1.model.users.User;

public class ProfileCommander extends Commander {

    public ProfileCommander() {
        super("User profile");
    }

    @Override
    public void execute() {
        User user = UserSession.getInstance().getCurrentUser();
        viewHandler.printProfile(user);
    }
}
