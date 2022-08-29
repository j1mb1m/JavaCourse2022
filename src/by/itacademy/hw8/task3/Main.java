package by.itacademy.hw8.task3;

import by.itacademy.hw8.task3.datasource.ThingDataSource;
import by.itacademy.hw8.task3.service.ThingHandler;
import by.itacademy.hw8.task3.model.ClothingSize;
import by.itacademy.hw8.task3.model.Color;
import by.itacademy.hw8.task3.model.ShoeSize;


public class Main {
    public static void main(String[] args) {
        //создаем и инициализируем каталог вещей
        ThingDataSource thingDataSource = new ThingDataSource();
        //создаем обработчик для работы с каталогом
        ThingHandler handler = new ThingHandler();
        //выводим доступные вещи из каталога
        handler.printCatalog(thingDataSource);
        System.out.println();

        //ищем по критериям и печатаем результат
        handler.printCatalog(handler.findThingByClothingSize(handler.findThingByColor(thingDataSource, new Color("белый")), ClothingSize.S));
        System.out.println();

        //ищем по критериям и печатаем результат
        handler.printCatalog(handler.findThingByShoeSize(handler.findThingByType(thingDataSource, "кроссовки"), ShoeSize.SIZE37));
        System.out.println();

        //ищем по критериям и печатаем результат
        handler.printCatalog(handler.findThingByShoeSize(handler.findThingByType(thingDataSource, "кеды"), ShoeSize.SIZE37));
        System.out.println();

        //ищем по критериям и печатаем результат
        handler.printCatalog(handler.findThingByClothingSize(handler.findThingByType(thingDataSource, "платье"), ClothingSize.L));
        System.out.println();

        //выполняем заказ вещей
        handler.orderThing(thingDataSource, 8);
        handler.orderThing(thingDataSource, 21);
        handler.orderThing(thingDataSource, 10);
        handler.orderThing(thingDataSource, 18);
        handler.orderThing(thingDataSource, 41);
        handler.orderThing(thingDataSource, 1);

        //печатаем заказанные вещи
        handler.printOrder(thingDataSource);
        handler.printCost(thingDataSource.getOrderedThings());
        System.out.println();

        //смотрим что осталось в каталоге
        handler.printCatalog(thingDataSource);
        System.out.println();
    }
}
