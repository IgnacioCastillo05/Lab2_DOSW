package edu.dosw.lab.comportamiento;
import edu.dosw.lab.util.AdvancedTechnician;
import edu.dosw.lab.util.BasicTechnician;
import edu.dosw.lab.util.IntermediateTechnician;
import edu.dosw.lab.util.Technical;
import edu.dosw.lab.util.Ticket;
import java.util.*;
import java.util.stream.Collectors;


public class Reto6SoporteTecnico {

    public static void ejecutar(String[] args) {
        // Crear técnicos
    Technical basic = new BasicTechnician();
    Technical intermediate = new IntermediateTechnician();
    Technical advanced = new AdvancedTechnician();

        // Crear cadena
    basic.setNextTechnical(intermediate);
    intermediate.setNextTechnical(advanced);

        // Tickets de prueba
        List<Ticket> tickets = Arrays.asList(
            new Ticket("básico", "baja", "Problema con login"),
            new Ticket("intermedio", "alta", "Error crítico en instalación"),
            new Ticket("avanzado", "media", "Caída del servidor"),
            new Ticket("básico", "alta", "Problema de facturación")
        );

        //Desarrollo con Streams y resolver tickets
        Map<String, Long> estadisticas = tickets.stream()
            .map(ticket -> {
                boolean resuelto = basic.solveTicket(ticket);
                if(!resuelto) {
                    System.out.println("Ticket: " + ticket.getDescription() + 
                                       " → Ningún técnico disponible. Pendiente de escalamiento.");
                    return "Pendiente";
                }
                if(ticket.getLevel().equalsIgnoreCase("básico")) return "Básico";
                if(ticket.getLevel().equalsIgnoreCase("intermedio")) return "Intermedio";
                if(ticket.getLevel().equalsIgnoreCase("avanzado")) return "Avanzado";
                return "Otro";
            })
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        // Mostrar estadísticas
        System.out.println("\n-- Estadísticas --");
        System.out.println("Básico: " + estadisticas.getOrDefault("Básico", 0L));
        System.out.println("Intermedio: " + estadisticas.getOrDefault("Intermedio", 0L));
        System.out.println("Avanzado: " + estadisticas.getOrDefault("Avanzado", 0L));
        System.out.println("Pendiente: " + estadisticas.getOrDefault("Pendiente", 0L));
    }

}
