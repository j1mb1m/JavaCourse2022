package by.itacademy.hw20.task1.menu;

import by.itacademy.hw20.task1.menu.command.admin.AuthorizationLogCommander;
import by.itacademy.hw20.task1.menu.command.admin.EditRoleCommander;

public class AdminMenu extends ReceptionMenu {
    public AdminMenu() {
        super();

        addCommand(new EditRoleCommander()); // profile
        addCommand(new AuthorizationLogCommander()); // profile
        description = "Please make your choice and press 'Enter':";

    }
}
