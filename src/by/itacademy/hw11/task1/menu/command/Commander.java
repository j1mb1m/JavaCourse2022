package by.itacademy.hw11.task1.menu.command;

import by.itacademy.hw11.task1.service.InputFromScanner;
import by.itacademy.hw11.task1.service.DataValidation;
import by.itacademy.hw11.task1.service.UserService;

public abstract class Commander {

    final String YES = "Y";
    final String NO = "N";

    protected InputFromScanner input = new InputFromScanner();
    protected DataValidation validation = new DataValidation();
    protected UserService userService = new UserService();
    protected String commandName;

    public Commander(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

    public void execute(){};

    public void repeat(){

        String command = input.enterFromScanner("Try again (Y/N)?");
        while (!(command.equalsIgnoreCase(YES) || command.equalsIgnoreCase(NO))) {
            command = input.enterFromScanner("");
        }
        if (command.equalsIgnoreCase(YES)) {
            execute();
        }
       // return false;
    }

}
