package by.itacademy.hw7.task4.view;

import by.itacademy.hw7.task4.entity.Color;

public class ConsoleViewServiceImpl implements ViewService {
    @Override
    public void printCost(double cost) {
        System.out.println("Стоимость букета " + cost);
    }

    @Override
    public void printColors(Color[] colors) {
        System.out.println("Цвета в букете: ");
        for (Color color : colors) {
            System.out.println("> " + color.getName());
        }

    }

    @Override
    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
