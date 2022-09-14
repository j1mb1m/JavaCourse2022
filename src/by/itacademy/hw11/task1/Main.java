package by.itacademy.hw11.task1;

import by.itacademy.hw11.task1.command.AuthorizationCommander;
import by.itacademy.hw11.task1.command.RegistrationCommander;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Welcome to Main menu. Please make your choice and press 'Enter':");
            System.out.println("1: Registration");
            System.out.println("2: Authorisation");
            System.out.println("Q: Exit");
            command = scanner.nextLine();

            switch (command.toUpperCase()) {
                case "1":
                    //регистрация
                    if (new RegistrationCommander().execute())
                        System.out.println("Registration was successful. User added!!!!!");
                    break;
                case "2":
                    //авторизация
                    if (new AuthorizationCommander().execute())
                        System.out.println("Authorization was successful. Congratulate!!!!!");
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Command not recognized, please try again!");
                    break;
            }

        } while (!command.equalsIgnoreCase("Q"));

    }


}
