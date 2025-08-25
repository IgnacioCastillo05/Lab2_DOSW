package edu.dosw.lab.util;

/**
 * Clase que representa un ticket de soporte técnico.
 * Contiene nivel, prioridad y descripción del problema.
 */
public class Ticket {
    /** Nivel del ticket (1=básico, 2=intermedio, 3=avanzado) */
    private int level;
    /** Prioridad del ticket (1=baja, 2=media, 3=alta) */
    private int priority;
    /** Descripción del problema */
    private String description;

    /**
     * Constructor del ticket.
     * @param level nivel numérico
     * @param priority prioridad numérica
     * @param description descripción del problema
     */
    public Ticket(int level, int priority, String description){
        this.level = level;
        this.priority = priority;
        this.description = description;
    }

    /**
     * Devuelve el nivel del ticket.
     * @return nivel numérico
     */
    public int getLevel() {
        return level;
    }

    /**
     * Devuelve la prioridad del ticket.
     * @return prioridad numérica
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Devuelve la descripción del ticket.
     * @return descripción
     */
    public String getDescription() {
        return description;
    }
}
