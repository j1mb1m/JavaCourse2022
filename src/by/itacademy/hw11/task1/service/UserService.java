package by.itacademy.hw11.task1.service;

import by.itacademy.hw11.task1.exception.UserNotExistException;
import by.itacademy.hw11.task1.exception.WrongLoginException;
import by.itacademy.hw11.task1.exception.WrongPasswordException;
import by.itacademy.hw11.task1.model.User;
import by.itacademy.hw11.task1.repository.UserRepository;

public class UserService {

    private final UserRepository repository = UserRepository.getInstance();

    public void addUser(final User user) {
        if (repository.getUsers().containsKey(user.getLogin())) {
            throw new WrongLoginException("ERROR! The login is already occupied!");
        }
        repository.getUsers().put(user.getLogin(), user);
    }

    public void checkUser(final User user) {

        if (!repository.getUsers().containsKey(user.getLogin())) {
            throw new UserNotExistException("ERROR! The user not found!");
        }
        User userDB = repository.getUsers().get(user.getLogin());
        if (!userDB.getPassword().equals(user.getPassword())) {
            throw new WrongPasswordException("ERROR! Password is not correct! The user has a different password!");
        }

    }

    public boolean checkLogin(final String login) {

        return repository.getUsers().containsKey(login);

    }

}
