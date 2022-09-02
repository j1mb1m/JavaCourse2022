package by.itacademy.hw11.task1.service.command;

import by.itacademy.hw11.task1.exception.WrongLoginException;
import by.itacademy.hw11.task1.exception.WrongPasswordException;
import by.itacademy.hw11.task1.model.User;
import by.itacademy.hw11.task1.service.LoginPasswordValidation;
import by.itacademy.hw11.task1.service.UserService;

public class RegistrationCommander implements Commander {

    @Override
    public boolean execute() {

        User user = null;
        try {
            user = LoginPasswordValidation.run();
        } catch (WrongPasswordException | WrongLoginException e) {
            e.printStackTrace();
        }

        if (user != null) {
            try {
                UserService userService = new UserService();
                userService.addUser(user);
            } catch (WrongLoginException e) {
                e.printStackTrace();
            }
        }

        return false;
    }
}
