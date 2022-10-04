package by.itacademy.hw11.task1.menu.command;

import by.itacademy.hw11.task1.model.User;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AuthorizationLogCommander extends Commander {

    public AuthorizationLogCommander() {
        super("Get authorization information for a period of time");
    }

    @Override
    public void execute() {

        try {
            String DATETIME_PATTERN = "yyyy-MM-dd_HH:mm";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATETIME_PATTERN);

            LocalDateTime dateStart = LocalDateTime.parse(input.enterDate(DATETIME_PATTERN), formatter);
            LocalDateTime dateEnd = LocalDateTime.parse(input.enterDate(DATETIME_PATTERN), formatter);

            List<User> logs = userService.getAuthorizationLog(dateStart, dateEnd);

            if(logs.isEmpty()) {
               viewHandler.print("Users not found!");
            }
            else
            {
                logs.forEach(viewHandler::print);
            }

        } catch (DateTimeException e) {
            viewHandler.print(e.getMessage());
            repeat();
        }

    }

}
