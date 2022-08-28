package by.itacademy.hw8.task2;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Joe","123456");
        user1.new Query().printToLog();

        User user2 = new User("Katy","454767");
        user2.new Query().printToLog();
    }
}
