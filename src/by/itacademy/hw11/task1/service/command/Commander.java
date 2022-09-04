package by.itacademy.hw11.task1.service.command;

import java.util.Scanner;

interface Commander {

    boolean execute();

    default boolean repeat(){
        System.out.println("Try again (Y/N)?");
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            command = scanner.next();
        } while (!(command.equalsIgnoreCase("Y") || command.equalsIgnoreCase("N")));
        if (command.equalsIgnoreCase("Y")) {
            return execute();
        }
        return false;
    }

}
