package by.itacademy.hw11.task1.service;

import by.itacademy.hw11.task1.exception.WrongLoginException;
import by.itacademy.hw11.task1.exception.WrongPasswordException;
import by.itacademy.hw11.task1.model.User;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPasswordValidation {

    private static final String PATTERN_LOGIN = "^(([a-zA-Z0-9]+)(_([a-zA-Z0-9]+))*){5,20}$";// знак подчеркивания д.б. в середине
    private static final String PATTERN_PASSWORD = "^[a-zA-Z0-9_]{8,}$";

    public static User run() throws WrongPasswordException, WrongLoginException {

        Scanner scanner = new Scanner(System.in);
        Pattern pattern;
        Matcher matcher;

        System.out.println("Enter your login:");
        String login = scanner.next();
        pattern = Pattern.compile(PATTERN_LOGIN);
        matcher = pattern.matcher(login);

        if (!matcher.matches()) throw new WrongLoginException("Wrong login! The login must contain numbers, digits and underscores, the length is from 5 to 20 characters.");

        System.out.println("Enter your password:");
        String password = scanner.next();
        pattern = Pattern.compile(PATTERN_PASSWORD);
        matcher = pattern.matcher(password);

        if (!matcher.matches()) throw new WrongPasswordException("Wrong password! The password must contain numbers, digits and underscores, the length is from 8 characters.");

        return new User(login, password);
    }
}
