package by.itacademy.hw20.task1.menu.command.reception;

import by.itacademy.hw20.task1.exception.room.RoomException;
import by.itacademy.hw20.task1.menu.command.Commander;

public class AddNewRoomCommander extends Commander {


    public AddNewRoomCommander() {
        super("Add new room");
    }

    @Override
    public void execute() {

        try {

            int roomNumber = Integer.parseInt(input.enterRoomNumber());
            roomService.addRoom(roomNumber);

            String command = input.enterFromScanner("Would you like to set the price for the room (Y/N)?");
            while (!(command.equalsIgnoreCase(YES) || command.equalsIgnoreCase(NO))) {
                command = input.enterFromScanner("");
            }

            if (command.equalsIgnoreCase(YES)) {
               new EditRoomPriceCommander().execute(roomNumber);
            }

        } catch (NumberFormatException | RoomException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }
    }
}
