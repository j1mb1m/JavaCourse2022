package by.itacademy.hw8.task2;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("Пользователь: логин='%s', пароль='%s'", login, password);
    }

    public class Query {
        public void printToLog() {
            System.out.println(User.this.toString() + " отправил запрос");
        }
    }
}
