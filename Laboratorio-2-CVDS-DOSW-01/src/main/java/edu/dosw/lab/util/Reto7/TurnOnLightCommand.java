package edu.dosw.lab.util.Reto7;

public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }
    @Override
    public void undo() {
        // Lógica para deshacer el encendido de la luz (por ejemplo, apagarla)
        light.turnOff();
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public String getDescription() {
        return "Encender luz";
    }
}
