package by.itacademy.hw11.task1.menu.command;

import by.itacademy.hw11.task1.exception.UserNotExistException;
import by.itacademy.hw11.task1.exception.WrongLoginException;
import by.itacademy.hw11.task1.exception.WrongPasswordException;
import by.itacademy.hw11.task1.model.User;

public class AuthorizationCommander extends Commander {

    public AuthorizationCommander() {
        super("Authorisation");
    }

    @Override
    public void execute() {

        try {
            String login = input.enterLogin();
            String password = input.enterPassword();

            userService.checkUser(new User(login, password));
            System.out.println("Authorization was successful. Congratulate!!!!!");

        } catch (WrongLoginException | WrongPasswordException | UserNotExistException e) {
            System.out.println(e.getMessage());
            repeat();
          }
    }
}
