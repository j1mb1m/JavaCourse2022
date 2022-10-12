package by.itacademy.hw20.task1.menu.command.login;

import by.itacademy.hw20.task1.service.UserSession;
import by.itacademy.hw20.task1.exception.user.UserNotExistException;
import by.itacademy.hw20.task1.exception.user.WrongLoginException;
import by.itacademy.hw20.task1.exception.user.WrongPasswordException;
import by.itacademy.hw20.task1.menu.command.Commander;
import by.itacademy.hw20.task1.model.users.User;

public class AuthorizationCommander extends Commander {

    public AuthorizationCommander() {
        super("Authorisation");
    }

    @Override
    public void execute() {

        try {
            String login = input.enterLogin();
            String password = input.enterPassword();

            User currentUser = new User(login, password);
            userService.checkUser(currentUser);
            UserSession.getInstance().setCurrentUser(userService.getUserByLogin(login));

            viewHandler.print("Authorization was successful. Congratulate!!!!!");

        } catch (WrongLoginException | WrongPasswordException | UserNotExistException e) {
            viewHandler.print(e.getMessage());
            repeat();
          }
    }
}
