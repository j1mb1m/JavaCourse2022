package by.itacademy.hw9.task2;

/**
 * Реализовать класс Pair, который будет содержать 2 значения любого типа.
 * Класс должен уметь возвращать первый элемент, второй элемент, менять их
 * местами, поменять первый элемент на новый, поменять второй элемент на новый.
 */
public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("id", 1234);
        System.out.printf("pair : %s%n", pair1);
        System.out.printf("First element : %s ('%s')%n", pair1.getFirstElement(), pair1.getFirstElement().getClass());
        System.out.printf("Second element :  %s ('%s')%n", pair1.getSecondElement(), pair1.getSecondElement().getClass());

        System.out.println();
        Pair<Integer, String> pair2 = pair1.swapFirstAndSecondElements();
        System.out.printf("Original : %s%n", pair2);
        pair2.setFirstElement(1);
        pair2.setSecondElement("ID");
        System.out.printf("Modifier : %s%n", pair2);
        System.out.printf("First element : %s ('%s')%n", pair2.getFirstElement(), pair2.getFirstElement().getClass());
        System.out.printf("Second element : %s ('%s')%n", pair2.getSecondElement(), pair2.getSecondElement().getClass());
    }
}
