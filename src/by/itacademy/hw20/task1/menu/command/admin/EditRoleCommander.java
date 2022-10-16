package by.itacademy.hw20.task1.menu.command.admin;

import by.itacademy.hw20.task1.menu.command.Commander;
import by.itacademy.hw20.task1.model.users.Role;
import by.itacademy.hw20.task1.model.users.User;

import java.util.HashMap;
import java.util.Map;

public class EditRoleCommander extends Commander {

    private final Map<Integer, Role> roles = new HashMap<>();

    public EditRoleCommander() {
        super("Edit role");
        roles.put(1, Role.ADMIN);
        roles.put(2, Role.MANAGER);
        roles.put(3, Role.USER);
    }

    @Override
    public void execute() {

        try {
            String login = input.enterLogin();
            User user = userService.getUserByLogin(login);

            int roleType = input.enterNumber("Choose: 1 - administrator, 2 - manager, 3 - user");
            Role role = roles.get(roleType);

            user.setRole(role);

            viewHandler.print("Role successfully changed.");

        } catch (NullPointerException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }
    }
}
