package by.itacademy.hw11.task1.command;

import by.itacademy.hw11.task1.service.InputFromScanner;
import by.itacademy.hw11.task1.service.LoginPasswordValidation;
import by.itacademy.hw11.task1.service.UserService;

public abstract class Commander {

    final String YES = "Y";
    final String NO = "N";

    protected InputFromScanner input = new InputFromScanner();
    protected LoginPasswordValidation validation = new LoginPasswordValidation();
    protected UserService userService = new UserService();

    abstract boolean execute();

    public boolean repeat(){

        String command = input.enterFromScanner("Try again (Y/N)?");
        while (!(command.equalsIgnoreCase(YES) || command.equalsIgnoreCase(NO))) {
            command = input.enterFromScanner("");
        }
        if (command.equalsIgnoreCase(YES)) {
            return execute();
        }
        return false;
    }

}
