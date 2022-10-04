package by.itacademy.hw11.task1.menu;

import by.itacademy.hw11.task1.menu.command.*;
import by.itacademy.hw11.task1.exception.IncorrectCommandException;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainMenu {

    private Map<String, Commander> commands = new LinkedHashMap<>();

    public MainMenu() {
        init();
    }

    public Map<String, Commander> getCommands() {
        return commands;
    }

    private void init() {
        commands.put("1", new RegistrationCommander());
        commands.put("2", new AuthorizationCommander());
        commands.put("3", new AuthorizationLogCommander());
        commands.put("Q", new ExitCommander());
    }

    public void executeCommand(String command){

        if (commands.containsKey(command)){
            commands.get(command).execute();
        }
        else {
           throw new IncorrectCommandException("Command not recognized, please try again!");
        }
    }
}
