package by.itacademy.hw12.task4.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PersonDataBase implements Serializable {

    static final long serialVersionUID = 7462893043929797948L;

    private final List<Person> people = new ArrayList<>();

    public PersonDataBase() {
        init();
    }

    private void init(){
        people.add(new Person("Иван", "Иванов", 25));
        people.add(new Person("Петр", "Пертов", 31));
        people.add(new Person("Сергей", "Орлов", 19));
        people.add(new Person("Николай", "Соколов", 22));
        people.add(new Person("Игорь", "Волков", 45));
    }

    public List<Person> getPeople() {
        return people;
    }

  }
