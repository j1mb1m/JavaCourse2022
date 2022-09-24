package by.itacademy.hw11.task1.menu.command;

import by.itacademy.hw11.task1.model.User;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AuthorizationLogCommander extends Commander{

    private final String DATETIME_PATTERN = "yyyyMMdd_HHmmss";

    public AuthorizationLogCommander() {
        super("Get authorization information for a period of time");
    }

    @Override
    public void execute() {

        boolean isCheckedException = true;

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATETIME_PATTERN);

            LocalDateTime dateStart = LocalDateTime.parse(input.enterDate(DATETIME_PATTERN), formatter);
            LocalDateTime dateEnd = LocalDateTime.parse(input.enterDate(DATETIME_PATTERN), formatter);

            List<User> logs = userService.getAuthorizationLog(dateStart, dateEnd);
            logs.stream().forEach(System.out::println);

        } catch (DateTimeException e) {
            System.out.println(e.getMessage());
            repeat();
        }

    }

}
