package edu.dosw.lab.util.Reto7;

public class History {
    private String userName;
    private Command command;
    private boolean undone;

    public History(String userName, Command command, boolean undone) {
        this.userName = userName;
        this.command = command;
        this.undone = undone;
    }

    public String getUserName() {
        return userName;
    }

    public Command getCommand() {
        return command;
    }

    public boolean isUndone() {
        return undone;
    }

}