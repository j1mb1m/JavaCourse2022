package by.itacademy.hw11.task1.command;

import by.itacademy.hw11.task1.exception.UserNotExistException;
import by.itacademy.hw11.task1.exception.WrongLoginException;
import by.itacademy.hw11.task1.exception.WrongPasswordException;
import by.itacademy.hw11.task1.model.User;

public class AuthorizationCommander extends Commander {

    @Override
    public boolean execute() {

        boolean isCheckedException = true;

        try {
            String login = input.enterLogin();
            String password = input.enterPassword();

            userService.checkUser(new User(login, password));

        } catch (WrongLoginException | WrongPasswordException | UserNotExistException e) {
            System.out.println(e.getMessage());
            isCheckedException = repeat();
          }

        return isCheckedException;
    }
}