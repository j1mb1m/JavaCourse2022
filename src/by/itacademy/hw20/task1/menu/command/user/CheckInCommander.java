package by.itacademy.hw20.task1.menu.command.user;

import by.itacademy.hw20.task1.exception.IncorrectDateException;
import by.itacademy.hw20.task1.exception.room.RoomException;
import by.itacademy.hw20.task1.menu.command.Commander;
import by.itacademy.hw20.task1.model.hotel.Order;
import by.itacademy.hw20.task1.service.UserSession;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CheckInCommander extends Commander {

    public CheckInCommander() {
        super("Check in");
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

            Order order = reservationService.checkInRoom(UserSession.getInstance().getCurrentUser(),
                    roomNumber,
                    dateStart,
                    dateEnd);

            viewHandler.print(String.format("The check in was successful. Created order №%s from %s current cost %s$",
                    order.getId(),
                    order.getDate(),
                    order.getCost()));

            viewHandler.print("");

        } catch (NumberFormatException | DateTimeException | IncorrectDateException | RoomException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }

    }
}