package Patterns.Behavioral.Command;

public class TravelAgent {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}