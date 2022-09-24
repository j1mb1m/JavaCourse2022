package by.itacademy.hw11.task1.menu.command;

public class ExitCommander extends Commander{

    public ExitCommander() {
        super("Exit");
    }

    @Override
    public void execute() {
        viewHandler.print("The work is completed");
        System.exit(0);
    }
}
