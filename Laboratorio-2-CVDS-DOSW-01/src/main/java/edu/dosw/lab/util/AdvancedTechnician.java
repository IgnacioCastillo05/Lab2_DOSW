package edu.dosw.lab.util;

/**
 * Técnico avanzado. Solo resuelve tickets de nivel 3.
 */
public class AdvancedTechnician extends Technical {
    /**
     * Constructor: asigna el nivel 3 al técnico avanzado.
     */
    public AdvancedTechnician() {
        this.level = 3;
    }

    /**
     * Imprime el mensaje de resolución para el técnico avanzado.
     */
    @Override
    public void printMessage() {
        System.out.println("Ticket resuelto por el Técnico Avanzado.");
    }

    /**
     * Solo resuelve tickets de nivel 3.
     */
    @Override
    public boolean puedeResolver(Ticket ticket) {
        return ticket.getLevel() == 3;
    }

    /**
     * Devuelve el nombre del nivel del técnico.
     */
    @Override
    public String getTechnicalLevel() {
        return "Avanzado";
    }
}
