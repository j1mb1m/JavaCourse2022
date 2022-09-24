package by.itacademy.hw11.task1.command;

import by.itacademy.hw11.task1.exception.WrongLoginException;
import by.itacademy.hw11.task1.exception.WrongPasswordException;
import by.itacademy.hw11.task1.model.User;

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

            userService.addUser(new User(login, password));
            System.out.println("Registration was successful. User added!!!!!");

        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
            repeat();
        }

      //  return true;
    }
}
