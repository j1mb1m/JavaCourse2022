package by.itacademy.hw8.task3;

import by.itacademy.hw8.task3.datasource.ThingDataSource;
import by.itacademy.hw8.task3.model.Color;
import by.itacademy.hw8.task3.model.size.ClothingSize;
import by.itacademy.hw8.task3.model.size.ShoeSize;
import by.itacademy.hw8.task3.service.ThingHandlerImpl;
import by.itacademy.hw8.task3.view.ThingView;
import by.itacademy.hw8.task3.view.ThingViewImpl;
import by.itacademy.hw8.task3.view.statusbar.StatusBarImpl;


public class Main {

    public static void main(String[] args) {

        //создаем и инициализируем каталог вещей
        ThingDataSource thingDataSource = new ThingDataSource();
        //создаем обработчик для работы с каталогом
        ThingHandlerImpl handler = new ThingHandlerImpl(new StatusBarImpl());
        //создаем обработчик для просмотра
        ThingView thingView = new ThingViewImpl(handler);

        //выводим доступные вещи из каталога
        thingView.printCatalog(thingDataSource);
        System.out.println();

        //ищем по критериям и печатаем результат
        thingView.printCatalog(handler.search(handler.search(thingDataSource, new Color("белый")), ClothingSize.S));
        System.out.println();

        //ищем по критериям и печатаем результат
        thingView.printCatalog(handler.search(handler.search(thingDataSource, "кроссовки"), ShoeSize.SIZE37));
        System.out.println();

        //ищем по критериям и печатаем результат
        thingView.printCatalog(handler.search(handler.search(thingDataSource, "кеды"), ShoeSize.SIZE37));
        System.out.println();

        //ищем по критериям и печатаем результат
        thingView.printCatalog(handler.search(handler.search(thingDataSource, "платье"), ClothingSize.L));
        System.out.println();

        //выполняем заказ вещей
        handler.orderThing(thingDataSource, 8);
        handler.orderThing(thingDataSource, 21);
        handler.orderThing(thingDataSource, 10);
        handler.orderThing(thingDataSource, 18);
        handler.orderThing(thingDataSource, 41);
        handler.orderThing(thingDataSource, 1);

        //печатаем заказанные вещи
        thingView.printOrder(thingDataSource);
        thingView.printCost(thingDataSource.getOrderedThings());
        System.out.println();

        //смотрим что осталось в каталоге
        thingView.printCatalog(thingDataSource);
        System.out.println();
    }
}
