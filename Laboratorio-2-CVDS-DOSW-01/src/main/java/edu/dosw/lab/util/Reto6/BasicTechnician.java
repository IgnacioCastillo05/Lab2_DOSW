package edu.dosw.lab.util.Reto6;

/**
 * Técnico básico. Solo resuelve tickets de nivel 1 y prioridad 1.
 */
public class BasicTechnician extends Technical {
    /**
     * Constructor: asigna el nivel 1 al técnico básico.
     */
    public BasicTechnician() {
        this.level = 1;
    }

    /**
     * Imprime el mensaje de resolución para el técnico básico.
     */
    @Override
    public void printMessage() {
        System.out.println("Ticket resuelto por el Técnico Básico.");
    }

    /**
     * Solo resuelve tickets de nivel 1 y prioridad 1.
     */
    @Override
    public boolean puedeResolver(Ticket ticket) {
        return ticket.getLevel() == 1 && ticket.getPriority() == 1;
    }

    /**
     * Devuelve el nombre del nivel del técnico.
     */
    @Override
    public String getTechnicalLevel() {
        return "Básico";
    }
}
