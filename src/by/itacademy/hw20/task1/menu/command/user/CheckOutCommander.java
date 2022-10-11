package by.itacademy.hw20.task1.menu.command.user;

import by.itacademy.hw20.task1.service.UserSession;
import by.itacademy.hw20.task1.exception.IncorrectDateException;
import by.itacademy.hw20.task1.exception.RoomAvailabilityException;
import by.itacademy.hw20.task1.exception.RoomNotExistException;
import by.itacademy.hw20.task1.menu.command.Commander;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CheckOutCommander extends Commander {

    public CheckOutCommander() {
        super("Check out");
    }

    @Override
    public void execute() {
        try {
            String DATETIME_PATTERN = "yyyy-MM-dd";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATETIME_PATTERN);

            int roomNumber = Integer.parseInt(input.enterRoomNumber());

            LocalDate dateStart = LocalDate.parse(input.enterDate(DATETIME_PATTERN), formatter);
            LocalDate dateEnd = LocalDate.parse(input.enterDate(DATETIME_PATTERN), formatter);

            validation.validatePeriod(dateStart, dateEnd);

            reservationService.checkOutRoom(UserSession.getInstance().getCurrentUser(), roomNumber, dateStart, dateEnd);

        } catch (NumberFormatException | DateTimeException | IncorrectDateException | RoomNotExistException |
                 RoomAvailabilityException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }

    }
}
