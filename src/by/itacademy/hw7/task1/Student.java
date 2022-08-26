package by.itacademy.hw7.task1;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int course;
    private StudyGroup group;
    private int averageRating;

    public Student(String firstName, String lastName, int course, StudyGroup group, int averageRating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.group = group;
        this.averageRating = averageRating;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final int getCourse() {
        return course;
    }

    public final StudyGroup getGroup() {
        return group;
    }

    public final int getAverageRating() {
        return averageRating;
    }

    public double getScholarshipAmount() {
        return averageRating >= 5 ? 100 : 0;
    }

    @Override
    public String toString() {
        return String.format("Студент: %s \nИмя: %s \nФамилия: %d\nНазвание группы: %s \nСредняя оценка: %d\nРазмер стипендии: %f",
                firstName, lastName, course, getGroup().getName(), averageRating, getScholarshipAmount());
    }
}
