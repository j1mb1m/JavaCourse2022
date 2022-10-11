package by.itacademy.hw20.task1.menu;

import by.itacademy.hw20.task1.exception.IncorrectCommandException;
import by.itacademy.hw20.task1.menu.command.Commander;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Menu {
    protected String description = "Welcome to menu. Please make your choice and press 'Enter':";

    protected Map<String, Commander> commands = new LinkedHashMap<>();

    public Menu() {
       // init();
    }

    public Map<String, Commander> getCommands() {
        return commands;
    }

   // abstract void init();

    public String getDescription() {
        return description;
    }

    public void executeCommand(String command){

        if (commands.containsKey(command)){
            commands.get(command).execute();
        }
        else {
            throw new IncorrectCommandException("Command not recognized, please try again!");
        }
    }

    protected void addCommand(Commander commander){
        int size = commands.size();
        commands.put(Integer.toString(size), commander);
    }
}
