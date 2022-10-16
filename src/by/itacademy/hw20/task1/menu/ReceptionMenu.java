package by.itacademy.hw20.task1.menu;

import by.itacademy.hw20.task1.menu.command.reception.*;

public class ReceptionMenu extends UserMenu{

    public ReceptionMenu() {
super();
        description = "Please make your choice and press 'Enter':";

        addCommand(new AddNewRoomCommander());
        addCommand(new EditRoomPriceCommander());
        addCommand(new AddNewServiceCommander());
        addCommand(new EditRoomPriceCommander());
        addCommand(new EditStatusRoomCommander());
        addCommand(new ShowAllBookingsCommander());
    }


}
