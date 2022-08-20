package by.itacademy.hw7.task4.view;

import by.itacademy.hw7.task4.entity.Color;

public class ConsoleViewService implements ViewServiceImpl{
    @Override
    public void printCost(double cost) {
        System.out.println("Стоимость букета " + cost);
    }

    @Override
    public void printColors(Color[] colors) {
        System.out.println("Цвета в букете: ");
        for (int i = 0; i < colors.length; i++) {
            System.out.println("> " +  colors[i].getName());
        }

    }

    @Override
    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
