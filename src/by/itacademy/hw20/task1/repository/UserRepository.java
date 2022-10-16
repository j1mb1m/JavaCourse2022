package by.itacademy.hw20.task1.repository;

import by.itacademy.hw20.task1.model.users.Role;
import by.itacademy.hw20.task1.model.users.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private final Map<String, User> users = new HashMap<>();
    private static UserRepository instance;

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    private UserRepository() {
        init();
    }

    private void init() {

        users.put("admin", new User("admin", "admin", Role.ADMIN));
        users.put("manager", new User("manager", "manager", Role.MANAGER));

    }

    public Map<String, User> getUsers() {
        return users;
    }
}
