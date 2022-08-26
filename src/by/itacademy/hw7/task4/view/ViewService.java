package by.itacademy.hw7.task4.view;

import by.itacademy.hw7.task4.entity.Color;

public class ViewService {

    public void printCost(double cost) {
        System.out.printf("Стоимость букета %f%n", cost);
    }

    public void printColors(Color[] colors) {
        System.out.println("Цвета в букете: ");
        for (Color color : colors) {
            System.out.printf("> %s%n", color.getName());
        }

    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
