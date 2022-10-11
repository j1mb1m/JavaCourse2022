package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.menu.*;
import by.itacademy.hw20.task1.model.users.User;

public final class UserSession {

    private static UserSession instance;
    private User currentUser;

    private UserSession() {
    }

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public void setCurrentUser(User user) {
        currentUser = user;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void cleanUserSession() {
        currentUser = null;// or null
    }

    public Menu getMenu() {
        if (currentUser != null) {
            switch (currentUser.getRole()) {
                case ADMIN -> {
                    return new AdminMenu();
                }
                case MANAGER -> {
                    return new ReceptionMenu();
                }

                default -> {
                    return new UserMenu();
                }
            }
        }
        return new MainMenu();
    }

    @Override
    public String toString() {
        return "UserSession: user name='" + currentUser.getLogin();
    }
}
