package by.itacademy.hw11.task1.datasource;

import by.itacademy.hw11.task1.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private final Map<String, User> users = new HashMap<>();
    private static volatile UserRepository instance;

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

        users.put("Admin", new User("Admin", "Admin"));
        users.put("Ivanov", new User("Ivanov", "12345678"));

    }

    public Map<String, User> getUsers() {
        return users;
    }
}
