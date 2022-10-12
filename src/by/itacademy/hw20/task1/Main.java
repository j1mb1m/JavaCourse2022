package by.itacademy.hw20.task1;

import by.itacademy.hw20.task1.exception.IncorrectCommandException;
import by.itacademy.hw20.task1.menu.Menu;
import by.itacademy.hw20.task1.menu.command.Commander;
import by.itacademy.hw20.task1.service.InputFromScanner;
import by.itacademy.hw20.task1.service.UserSession;
import by.itacademy.hw20.task1.view.ViewHandler;

import java.util.Map;

/**
 * Электронное бронирование номеров.
 * 1. Предусмотрено только самостоятельное бронирование и выселение;
 * 2. Возможность открытия заказа с частичным пополнением услуг и последующим закрытием,
 * если не планируется использование услуг.
 */

public class Main {

    public static void main(String[] args) {
        InputFromScanner input = new InputFromScanner();
        ViewHandler viewHandler = new ViewHandler();
        UserSession userSession = UserSession.getInstance();

        boolean exit = false;

        while(!exit) {
            Menu menu = userSession.getMenu();
            Map<String, Commander> commands = menu.getCommands();

            viewHandler.print(menu.getDescription());
            commands.forEach((s, commander) -> viewHandler.print(String.format("%s. %s", s, commander.getCommandName())));

            String command = input.enterFromScanner().toUpperCase();

            try {
                menu.executeCommand(command);
            }
            catch (IncorrectCommandException e){
                viewHandler.print(e.getMessage());
            }
            exit = userSession.isEndSession();
        }
    }


}
