package by.itacademy.hw11.task1.service.command;

import by.itacademy.hw11.task1.exception.UserNotExistException;
import by.itacademy.hw11.task1.exception.WrongLoginException;
import by.itacademy.hw11.task1.exception.WrongPasswordException;
import by.itacademy.hw11.task1.model.User;
import by.itacademy.hw11.task1.service.LoginPasswordValidation;
import by.itacademy.hw11.task1.service.UserService;

public class AuthorizationCommander implements Commander {
    @Override
    public boolean execute() {

        try {
            User user = LoginPasswordValidation.run();
            UserService userService = new UserService();
            return userService.checkUser(user);

        } catch (WrongLoginException | WrongPasswordException | UserNotExistException e) {
            e.printStackTrace();
        }

        return false;
    }
}
