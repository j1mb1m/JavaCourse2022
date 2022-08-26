package by.itacademy.hw7.task1;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int course;
    private StudyGroup group;
    private int averageRating;

    public Student(String firstName, String lastName, int course, StudyGroup group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.group = group;
    }

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

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final int getCourse() {
        return course;
    }

    public final void setCourse(int course) {
        this.course = course;
    }

    public final StudyGroup getGroup() {
        return group;
    }

    public void setGroup(StudyGroup group) {
        this.group = group;
    }

    public final int getAverageRating() {
        return averageRating;
    }

    public final void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public double getScholarshipAmount() {
        return averageRating >= 5 ? 100 : 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && averageRating == student.averageRating && firstName.equals(student.firstName) && lastName.equals(student.lastName) && group.equals(student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, course, group, averageRating);
    }

    @Override
    public String toString() {
        return String.format("Студент: %s \nИмя: %s \nФамилия: %d\nНазвание группы: %s \nСредняя оценка: %d\nРазмер стипендии: %f",
                firstName, lastName, course, getGroup().getName(), averageRating, getScholarshipAmount());
    }
}
