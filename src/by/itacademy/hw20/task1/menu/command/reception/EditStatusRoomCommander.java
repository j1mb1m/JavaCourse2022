package by.itacademy.hw20.task1.menu.command.reception;

import by.itacademy.hw20.task1.exception.IncorrectDateException;
import by.itacademy.hw20.task1.exception.RoomAvailabilityException;
import by.itacademy.hw20.task1.exception.RoomNotExistException;
import by.itacademy.hw20.task1.menu.command.Commander;
import by.itacademy.hw20.task1.model.hotel.RoomReservationRecord;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EditStatusRoomCommander extends Commander {

    public EditStatusRoomCommander() {
        super("Change the status of a room");
    }

    @Override
    public void execute() {

        try {
            String DATETIME_PATTERN = "yyyy-MM-dd";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATETIME_PATTERN);

            int roomNumber = Integer.parseInt(input.enterRoomNumber());

            LocalDate dateStart = LocalDate.parse(input.enterStartDate(DATETIME_PATTERN), formatter);
            LocalDate dateEnd = LocalDate.parse(input.enterEndDate(DATETIME_PATTERN), formatter);
            validation.validatePeriod(dateStart, dateEnd);
            RoomReservationRecord record = reservationService.doRoomRenovation(
                    roomNumber,
                    dateStart,
                    dateEnd);

            viewHandler.print(String.format("Status changed: room №%s for the period %s - %s status %s",
                    record.getRoom(), record.getStartBooking(), record.getEndBooking(), record.getStatus()));

            viewHandler.print("");

        } catch (NumberFormatException | DateTimeException | IncorrectDateException | RoomNotExistException |
                 RoomAvailabilityException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }
    }
}
