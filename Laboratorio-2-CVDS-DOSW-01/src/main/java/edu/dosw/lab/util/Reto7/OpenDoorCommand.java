package edu.dosw.lab.util.Reto7;

public class OpenDoorCommand implements Command {
    private Door door;

    public OpenDoorCommand(Door door){
        this.door = door;
    }

    public void execute() {
        door.open();
    }

    public void undo() {
        door.close();
    }

    public String getDescription() {
        return "Abrir puerta";
    }
}
