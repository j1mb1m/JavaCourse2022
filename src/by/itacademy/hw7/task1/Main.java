package by.itacademy.hw7.task1;

public class Main {
    public static void main(String[] args) {
        StudyGroup groupISIT = new StudyGroup("ИСИТ");
        StudyGroup groupMarket = new StudyGroup("Маркетинг");
        StudyGroup groupCW = new StudyGroup("КД");
        StudyGroup groupEcon = new StudyGroup("ЭУП");

        Student[] students = new Student[6];

        students[0] = new Student("Иван", "Иванов", 1, groupISIT, 5);
        students[1] = new Student("Сергей", "Соколов", 4, groupMarket, 4);
        students[2] = new Student("Анна", "Каренина", 3, groupCW, 3);
        students[3] = new GraduateStudent("Анатолий", "Королев", 1, groupMarket, 4);
        students[4] = new Student("Сергей", "Чувак", 5, groupCW, 5);
        students[5] = new GraduateStudent("Ирина", "Афанасьва", 1, groupEcon, 4);

        for (Student student: students ) {
            System.out.println(student.getFullInfo());
            System.out.println();
        }

    }
}
