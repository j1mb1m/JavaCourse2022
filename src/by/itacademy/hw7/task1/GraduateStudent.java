package by.itacademy.hw7.task1;

import java.util.Objects;

public class GraduateStudent extends Student {

    private String scientificWork;

    public GraduateStudent(String firstName, String lastName, int course, StudyGroup group) {
        super(firstName, lastName, course, group);
        this.scientificWork = "<не указана>";
    }

    public GraduateStudent(String firstName, String lastName, int course, StudyGroup group, int averageRating) {
        super(firstName, lastName, course, group, averageRating);
        this.scientificWork = "<не указана>";
    }

    public GraduateStudent(String firstName, String lastName, int course, StudyGroup group, String scientificWork) {
        super(firstName, lastName, course, group);
        this.scientificWork = scientificWork;
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

    public String getFullInfo() {
        // Вывести: имя, фамилия, номер курса, название группы, средняя оценка, размер стипендии
        return "Аспирант:" +
                "\nИмя:              " + getFirstName() +
                "\nФамилия:          " + getLastName() +
                "\nНомер курса:      " + getCourse() +
                "\nНазвание группы:  " + getGroup().getName() +
                "\nНаучная работа:   " + getScientificWork() +
                "\nСредняя оценка:   " + getAverageRating() +
                "\nРазмер стипендии: " + getScholarshipAmount();
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
