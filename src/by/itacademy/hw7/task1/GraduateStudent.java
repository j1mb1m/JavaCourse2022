package by.itacademy.hw7.task1;

import java.util.Objects;

public class GraduateStudent extends Student {

    private String scientificWork = "<не указана>";

    public GraduateStudent(String firstName, String lastName, int course, StudyGroup group, int averageRating) {
        super(firstName, lastName, course, group, averageRating);
    }

    public GraduateStudent(String firstName, String lastName, int course, StudyGroup group, int averageRating, String scientificWork) {
        super(firstName, lastName, course, group, averageRating);
        this.scientificWork = scientificWork;
    }

    public final String getScientificWork() {
        return scientificWork;
    }

    public final void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public String toString() {
        // Вывести: имя, фамилия, номер курса, название группы, средняя оценка, размер стипендии
        return String.format("Аспирант: %s \nИмя: %s \nФамилия: %d\nНазвание группы: %s \nНаучная работа: %s \nСредняя оценка: %d\nРазмер стипендии: %f",
                getFirstName(), getLastName(), getCourse(), getGroup().getName(), scientificWork, getAverageRating(), getScholarshipAmount());
    }

    @Override
    public double getScholarshipAmount() {
        if (getAverageRating() >= 5) {
            return 200;
        } else return 180;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GraduateStudent that = (GraduateStudent) o;
        return Objects.equals(scientificWork, that.scientificWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), scientificWork);
    }
}
