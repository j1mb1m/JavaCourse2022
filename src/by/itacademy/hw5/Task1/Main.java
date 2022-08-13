package by.itacademy.hw5.Task1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.talk();
        person1.move();

        Person person2 = new Person("Иванов Иван Иванович", 22);
        person2.talk();
        person2.move();
    }
}
