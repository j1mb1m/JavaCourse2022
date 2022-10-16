package by.itacademy.hw20.task1.menu.command.reception;

import by.itacademy.hw20.task1.exception.room.RoomException;
import by.itacademy.hw20.task1.menu.command.Commander;
import by.itacademy.hw20.task1.model.hotel.Room;

import java.math.BigDecimal;

public class EditRoomPriceCommander extends Commander {

    public EditRoomPriceCommander() {
        super("Change the price of a room");
    }

    @Override
    public void execute() {

        try {
            int roomNumber = Integer.parseInt(input.enterRoomNumber());

            execute(roomNumber);

        } catch (NumberFormatException | RoomException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }
    }

    public void execute(int roomNumber) {

        Room room = roomService.getRoom(roomNumber);

        BigDecimal newPrice = input.enterBigDecimal("Enter the new price: ");
        roomService.setPriceOfRoom(room, newPrice);

        viewHandler.print(String.format("New price for room %s - %s$", room.getNumber(), room.getPrice()));

    }
}
