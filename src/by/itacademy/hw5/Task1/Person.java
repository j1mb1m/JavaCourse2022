package by.itacademy.hw5.Task1;

public class Person {
    public String fullName;
    public int age;

    public Person() {
        this.fullName = "<Имя не задано>";
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.printf("Передвигается %s", this.fullName);
        System.out.println();
    }
    public void talk() {
        System.out.printf("Говорит %s", this.fullName);
        System.out.println();
    }
}
