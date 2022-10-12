package by.itacademy.hw20.task1.menu.command.login;

import by.itacademy.hw20.task1.service.UserSession;
import by.itacademy.hw20.task1.exception.user.WrongLoginException;
import by.itacademy.hw20.task1.exception.user.WrongPasswordException;
import by.itacademy.hw20.task1.menu.command.Commander;
import by.itacademy.hw20.task1.model.users.User;

public class RegistrationCommander extends Commander {

    public RegistrationCommander() {
        super("Registration");
    }

    @Override
    public void execute() {

        try {
            String login = input.enterLogin();
            validation.validateLogin(login);

            if (userService.checkLogin(login)) {
                throw new WrongLoginException("ERROR! The login is already occupied!");
            }

            String password = input.enterPassword();
            validation.validatePassword(password);

            User currentUser = new User(login, password);
            userService.addUser(currentUser);
            UserSession.getInstance().setCurrentUser(currentUser);
            viewHandler.print("Registration was successful. User added!!!!!");

        } catch (WrongPasswordException | WrongLoginException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }

    }
}
