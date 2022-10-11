package by.itacademy.hw20.task1.menu;

import by.itacademy.hw20.task1.menu.command.login.ExitCommander;
import by.itacademy.hw20.task1.menu.command.login.LogoutCommander;
import by.itacademy.hw20.task1.menu.command.user.*;

public class UserMenu extends Menu{

    public UserMenu() {
        super();

        description = "Please make your choice and press 'Enter':";

        commands.put("Q", new ExitCommander()); // выйти из программы
        addCommand(new LogoutCommander()); // завершить сеанс
        addCommand(new ProfileCommander()); // profile
        addCommand(new GetFreeRoomsCommander());//получить свободные номера
        addCommand(new CheckInCommander()); // заселиться в номер
        addCommand(new CheckOutCommander()); // освободить номер
        addCommand(new GetServicesCommander()); // получить услуги
        addCommand(new UseServiceCommander()); // получить услуги
        addCommand(new PayOrderCommander()); // оплатить услугу


    }
}
