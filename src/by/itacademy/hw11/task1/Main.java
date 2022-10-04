package by.itacademy.hw11.task1;

import by.itacademy.hw11.task1.menu.command.Commander;
import by.itacademy.hw11.task1.menu.MainMenu;
import by.itacademy.hw11.task1.exception.IncorrectCommandException;
import by.itacademy.hw11.task1.service.InputFromScanner;
import by.itacademy.hw11.task1.view.ViewHandler;

import java.util.Map;


public class Main {


    public static void main(String[] args) {
        InputFromScanner input = new InputFromScanner();
        ViewHandler viewHandler = new ViewHandler();

        MainMenu mainMenu = new MainMenu();
        Map<String, Commander> commands = mainMenu.getCommands();

        while(true) {
            viewHandler.print("Welcome to Main menu. Please make your choice and press 'Enter':");
            commands.forEach((s, commander) -> viewHandler.print(String.format("%s. %s", s, commander.getCommandName())));

            String command = input.enterFromScanner().toUpperCase();

            try {
                mainMenu.executeCommand(command);
            }
            catch (IncorrectCommandException e){
                viewHandler.print(e.getMessage());
            }
        }
    }


}
