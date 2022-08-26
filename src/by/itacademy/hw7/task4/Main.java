package by.itacademy.hw7.task4;


import by.itacademy.hw7.task4.controller.BouquetController;
import by.itacademy.hw7.task4.entity.*;
import by.itacademy.hw7.task4.view.ConsoleViewServiceImpl;

public class Main {
    public static void main(String[] args) {
        Color red = new Color("Красный");
        Color yellow = new Color("Желтый");
        Color green = new Color("Зеленый");
        Color pink = new Color("Розовый");
        Color white = new Color("Белый");

        BouquetController controller = new BouquetController(new Bouquet(), new ConsoleViewServiceImpl());

        controller.addFlower(new Rose(red, 3.5, 5),
                new Rose(red, 3.5, 5),
                new Eucalyptus(green, 3, 10),
                new Eucalyptus(green, 3, 10),
                new Eucalyptus(green, 3, 10),
                new Pion(pink, 4, 9),
                new Сarnation(red, 2, 7),
                new Chamomile(yellow, 2.5, 11),
                new Rose(white, 5, 7),
                new Rose(red, 3.5, 5));

        controller.printColors();
        controller.printWiltingOfTheBouquet();
        controller.printCost();

    }
}
