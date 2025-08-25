

package edu.dosw.lab.util.Reto7;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import java.util.Stack;

public class RemoteControl {
    private Stack<Command> history = new Stack<>();
    private List<History> records = new ArrayList<>();

    public void executeCommand(String userName, Command command, boolean undone) {
        command.execute();
        history.push(command);
        if(undone){
            command.undo();
            records.add(new History(userName, command, true));
        } else{
            records.add(new History(userName, command, false));
        }

    }

    public void showHistory() {
        System.out.println("Ejecución de Acciones:");
        for (History r : records) {
            System.out.println("Acción ejecutada por " + r.getUserName() + ": " + r.getCommand().getDescription());
            if (r.isUndone()) {
                System.out.println("Acción deshecha: " + r.getCommand().getDescription());
            }
        }

        System.out.println("Historial completo:");
        for (History r : records) {
            System.out.println(r.getCommand().getDescription() + " -> Usuario: " + r.getUserName() +
                    (r.isUndone() ? " (deshecha)" : ""));
        }

        System.out.println("Investigando quién desconfiguró los electrodomésticos:");
        Map<String, Integer> contador = new HashMap<>();
        for (History r : records) {
            contador.put(r.getUserName(), contador.getOrDefault(r.getUserName(), 0) + 1);
        }
        for (var entry : contador.entrySet()) {
            System.out.println(entry.getKey() + " realizó " + entry.getValue() + " acciones.");
        }

        // Mostrar quién alteró la configuración (acciones deshechas)
        System.out.println("\nUsuarios que alteraron la configuración (acciones deshechas):");
        boolean found = false;
        for (History r : records) {
            if (r.isUndone()) {
                System.out.println("- " + r.getUserName() + " alteró la configuración con: " + r.getCommand().getDescription());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Ningún usuario alteró la configuración.");
        }
    }
}
