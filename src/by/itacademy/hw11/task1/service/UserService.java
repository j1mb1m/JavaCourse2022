package by.itacademy.hw11.task1.service;

import by.itacademy.hw11.task1.datasource.UserRepository;
import by.itacademy.hw11.task1.exception.UserNotExistException;
import by.itacademy.hw11.task1.exception.WrongLoginException;
import by.itacademy.hw11.task1.exception.WrongPasswordException;
import by.itacademy.hw11.task1.model.User;

public class UserService {

    private final UserRepository users = UserRepository.getInstance();

    public void addUser(final User user) throws WrongLoginException {
        if (users.getUsers().containsKey(user.getLogin()))
            throw new WrongLoginException("ERROR! The login is already occupied!");
            users.getUsers().put(user.getLogin(), user);
    }

    public boolean checkUser(final User user) throws UserNotExistException, WrongPasswordException {

        if (!users.getUsers().containsKey(user.getLogin()))
            throw new UserNotExistException("ERROR! The user not found!");
        User userDB = users.getUsers().get(user.getLogin());
        if (!userDB.getPassword().equals(user.getPassword()))
            throw new WrongPasswordException("ERROR! Password is not correct! The user has a different password!");

        return true;
    }

}
