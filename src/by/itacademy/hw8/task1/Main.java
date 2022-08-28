package by.itacademy.hw8.task1;

public class Main {
    public static void main(String[] args) {
        Food soup = new Food();
        soup.prepare(new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println(str);
            }
        }, "Сварить суп") ;

        Food potato = new Food();
        potato.prepare(new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println(str);
            }
        }, "Пожарить картошку");
    }
}
