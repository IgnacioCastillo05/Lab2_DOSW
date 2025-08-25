package edu.dosw.lab.comportamiento;

import edu.dosw.lab.util.AdvancedTechnician;
import edu.dosw.lab.util.BasicTechnician;
import edu.dosw.lab.util.IntermediateTechnician;
import edu.dosw.lab.util.Technical;
import edu.dosw.lab.util.Ticket;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Clase principal para la simulación de un sistema de soporte técnico usando Chain of Responsibility.
 * Permite ingresar tickets, procesarlos y mostrar estadísticas de resolución por técnico.
 */
public class Reto6TechnicalSupport {

    /**
     * Diccionarios para convertir los niveles y prioridades de texto a valores numéricos.
     * básico=1, intermedio=2, avanzado=3; baja=1, media=2, alta=3
     */
    private static final Map<String, Integer> LEVEL_MAP = new HashMap<>();
    private static final Map<String, Integer> PRIORITY_MAP = new HashMap<>();
    static {
        LEVEL_MAP.put("basico", 1);
        LEVEL_MAP.put("intermedio", 2);
        LEVEL_MAP.put("avanzado", 3);

        PRIORITY_MAP.put("baja", 1);
        PRIORITY_MAP.put("media", 2);
        PRIORITY_MAP.put("alta", 3);
    }

    /**
     * Convierte el string de nivel a su valor numérico correspondiente.
     * @param level nivel en texto
     * @return valor numérico del nivel
     */
    private static int getLevelNumber(String level) {
        return LEVEL_MAP.getOrDefault(level.toLowerCase(), 0);
    }

    /**
     * Convierte el string de prioridad a su valor numérico correspondiente.
     * @param priority prioridad en texto
     * @return valor numérico de la prioridad
     */
    private static int getPriorityNumber(String priority) {
        return PRIORITY_MAP.getOrDefault(priority.toLowerCase(), 0);
    }

    /**
     * Método principal de ejecución. Solicita los tickets al usuario, procesa la cadena de técnicos
     * y muestra las estadísticas de resolución.
     * @param args argumentos de línea de comandos (no usados)
     */
    public static void ejecutar(String[] args) {
        Scanner sc = new Scanner(System.in);

    // Crear técnicos (Chain of Responsibility)
        Technical basic = new BasicTechnician();
        Technical intermediate = new IntermediateTechnician();
        Technical advanced = new AdvancedTechnician();

    // Enlazar técnicos en la cadena de responsabilidad
        basic.setNextTechnical(intermediate);
        intermediate.setNextTechnical(advanced);
        advanced.setNextTechnical(null);

        // Pedir número de tickets
        System.out.print("Ingrese el número de tickets: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar el salto de línea

    List<Ticket> tickets = new ArrayList<>();

    // Ingresar tickets desde consola
        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Ticket " + i + " ---");

            System.out.print("Nivel (básico/intermedio/avanzado): ");
            String levelStr = sc.nextLine();
            int level = getLevelNumber(levelStr);

            System.out.print("Prioridad (baja/media/alta): ");
            String priorityStr = sc.nextLine();
            int priority = getPriorityNumber(priorityStr);

            System.out.print("Descripción: ");
            String description = sc.nextLine();

            tickets.add(new Ticket(level, priority, description));
        }

    // Procesar tickets y contar quién resolvió cada uno usando streams
        Map<String, Long> estadisticas = tickets.stream()
            .map(ticket -> basic.solveTicket(ticket))
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

    // Mostrar estadísticas finales
        System.out.println("\n-- Estadísticas --");
        System.out.println("Básico: " + estadisticas.getOrDefault("Básico", 0L));
        System.out.println("Intermedio: " + estadisticas.getOrDefault("Intermedio", 0L));
        System.out.println("Avanzado: " + estadisticas.getOrDefault("Avanzado", 0L));
        System.out.println("Pendiente: " + estadisticas.getOrDefault("Pendiente", 0L));
    }

}