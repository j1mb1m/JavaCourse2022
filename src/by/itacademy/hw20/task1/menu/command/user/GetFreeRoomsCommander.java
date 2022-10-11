package by.itacademy.hw20.task1.menu.command.user;

import by.itacademy.hw20.task1.menu.command.Commander;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GetFreeRoomsCommander extends Commander {

    public GetFreeRoomsCommander() {
        super("Get free rooms");
    }

    @Override
    public void execute() {
        try {
            String DATE_PATTERN = "yyyy-MM-dd";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);

            LocalDate dateStart = LocalDate.parse(input.enterDate(DATE_PATTERN), formatter);
            LocalDate dateEnd = LocalDate.parse(input.enterDate(DATE_PATTERN), formatter);

            viewHandler.showAvailableRooms(dateStart, dateEnd);

        } catch (DateTimeException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }

    }
}
