package by.itacademy.hw20.task1.menu;

import by.itacademy.hw20.task1.menu.command.login.AuthorizationCommander;
import by.itacademy.hw20.task1.menu.command.login.ExitCommander;
import by.itacademy.hw20.task1.menu.command.login.RegistrationCommander;

public class MainMenu extends Menu {

    public MainMenu() {

        description = "Welcome to Main menu. Please make your choice and press 'Enter':";

        addCommand(new RegistrationCommander());
        addCommand(new AuthorizationCommander());
        commands.put("Q", new ExitCommander());
    }

}
