package by.itacademy.hw7.task1;

public class Main {
    private Student[] students;

    public static void main(String[] args) {
        StudyGroup groupISIT = new StudyGroup("ИСИТ");
        StudyGroup groupMarket = new StudyGroup("Маркетинг");
        StudyGroup groupCW = new StudyGroup("КД");
        StudyGroup groupEcon = new StudyGroup("ЭУП");

        Student[] students = new Student[]{
                new Student("Иван", "Иванов", 1, groupISIT, 5),
                new Student("Сергей", "Соколов", 4, groupMarket, 4),
                new Student("Анна", "Каренина", 3, groupCW, 3),
                new GraduateStudent("Анатолий", "Королев", 1, groupMarket, 4),
                new Student("Сергей", "Чувак", 5, groupCW, 5),
                new GraduateStudent("Ирина", "Афанасьва", 1, groupEcon, 4),
                new GraduateStudent("Ирина", "Афанасьва", 1, groupEcon, 4, "Влияние санкций на экономику страны")
        };

        for (Student student : students) {
            System.out.println(student.toString());
            System.out.println();
        }

    }
}
