
package edu.dosw.lab.comportamiento;

import java.util.Scanner;
import edu.dosw.lab.util.Reto7.Command;
import edu.dosw.lab.util.Reto7.TurnOnLightCommand;
import edu.dosw.lab.util.Reto7.OpenDoorCommand;
import edu.dosw.lab.util.Reto7.PlayMusicCommand;
import edu.dosw.lab.util.Reto7.AdjustVolumeCommand;
import edu.dosw.lab.util.Reto7.Light;
import edu.dosw.lab.util.Reto7.Door;
import edu.dosw.lab.util.Reto7.Music;
import edu.dosw.lab.util.Reto7.RemoteControl;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Reto7MagicControl {
    public static void ejecutar(String[] args) {
        Scanner sc = new Scanner(System.in);

        Light luz = new Light();
        Door puerta = new Door();
        Music musica = new Music();
        RemoteControl control = new RemoteControl();

        System.out.println("\nNúmero de acciones a registrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nAcción " + i + ":");
            System.out.println("Usuario: ");
            String usuario = sc.nextLine();

            System.out.println("\nSeleccione: 1. Encender luz 2. Abrir puerta 3. Reproducir música 4. Ajustar volumen");
            int opcion = sc.nextInt();
            sc.nextLine();

            Map<Integer, Supplier<Command>> acciones = new HashMap<>();
            acciones.put(1, () -> new TurnOnLightCommand(luz));
            acciones.put(2, () -> new OpenDoorCommand(puerta));
            acciones.put(3, () -> new PlayMusicCommand(musica));

            Command comando = null;
            if (opcion == 4) {
                System.out.println("\nIngrese valor (0-100): ");
                int vol = sc.nextInt();
                sc.nextLine();
                comando = new AdjustVolumeCommand(musica, vol);
            } else {
                comando = acciones.getOrDefault(opcion, () -> null).get();
            }

            System.out.println("¿Deshacer acción? (si/no): ");
            String deshacer = sc.nextLine();

            control.executeCommand(usuario, comando, deshacer.equalsIgnoreCase("si"));
        }

        control.showHistory();
    }
}