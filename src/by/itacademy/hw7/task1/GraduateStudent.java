package by.itacademy.hw7.task1;

public class GraduateStudent extends Student {

    private String scientificWork = "<не указана>";

    public GraduateStudent(String firstName, String lastName, int course, StudyGroup group, int averageRating) {
        super(firstName, lastName, course, group, averageRating);
    }

    public GraduateStudent(String firstName, String lastName, int course, StudyGroup group, int averageRating, String scientificWork) {
        super(firstName, lastName, course, group, averageRating);
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

}
