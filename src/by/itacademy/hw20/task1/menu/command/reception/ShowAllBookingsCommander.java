package by.itacademy.hw20.task1.menu.command.reception;

import by.itacademy.hw20.task1.menu.command.Commander;

public class ShowAllBookingsCommander extends Commander {

    public ShowAllBookingsCommander() {
        super("Show all booked room");
    }

    @Override
    public void execute() {

        try {
            viewHandler.showRoomReservationRecords();

        } catch (NullPointerException | NumberFormatException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }
    }
}
