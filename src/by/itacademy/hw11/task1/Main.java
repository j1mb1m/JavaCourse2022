package by.itacademy.hw11.task1;

import by.itacademy.hw11.task1.command.Commander;
import by.itacademy.hw11.task1.commandMenu.MainMenu;
import by.itacademy.hw11.task1.exception.IncorrectCommandException;
import by.itacademy.hw11.task1.service.InputFromScanner;

import java.util.Map;


public class Main {
    private static InputFromScanner input = new InputFromScanner();

    public static void main(String[] args) {

        MainMenu mainMenu = new MainMenu();
        Map<String, Commander> commands = mainMenu.getCommands();

        while(true) {
            System.out.println("Welcome to Main menu. Please make your choice and press 'Enter':");
            commands.forEach((s, commander) -> System.out.printf("%s. %s%n", s, commander.getCommandName()));

            String command = input.enterFromScanner().toUpperCase();

            try {
                mainMenu.executeCommand(command);
            }
            catch (IncorrectCommandException e){
                System.out.println(e.getMessage());
            }
        }
    }


}
