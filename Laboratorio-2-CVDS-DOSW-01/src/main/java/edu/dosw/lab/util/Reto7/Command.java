package edu.dosw.lab.util.Reto7;

public interface Command {
    void execute();

    void undo();

    String getDescription();
}
