package edu.dosw.lab.util.Reto6;

/**
 * Clase abstracta base para los técnicos de soporte.
 * Implementa la lógica de Chain of Responsibility y ocupación.
 */
public abstract class Technical {
    /** Siguiente técnico en la cadena */
    protected Technical nextTechnical;
    /** Indica si el técnico está disponible */
    protected boolean isAvailable;
    /** Nivel del técnico (1=básico, 2=intermedio, 3=avanzado) */
    protected int level;

    /**
     * Determina si el técnico puede resolver el ticket.
     * @param ticket ticket a evaluar
     * @return true si puede resolverlo, false si no
     */
    public abstract boolean puedeResolver(Ticket ticket);

    /**
     * Devuelve el nombre del nivel del técnico.
     * @return nombre del nivel
     */
    public abstract String getTechnicalLevel();

    /**
     * Enlaza el siguiente técnico en la cadena y marca disponible.
     * @param nextTechnical siguiente técnico
     */
    public void setNextTechnical(Technical nextTechnical) {
        this.nextTechnical = nextTechnical;
        this.isAvailable = true;
    }

    /**
     * Devuelve el siguiente técnico en la cadena.
     * @return siguiente técnico
     */
    public Technical getNextTechnician() {
        return nextTechnical;
    }

    /**
     * Intenta resolver el ticket. Si no puede, lo delega al siguiente técnico.
     * Si lo resuelve y la prioridad coincide con su nivel, queda ocupado.
     * @param ticket ticket a resolver
     * @return nombre del técnico que resolvió el ticket o 'Pendiente'
     */
    public String solveTicket(Ticket ticket) {
        if (isAvailable && puedeResolver(ticket)) {
            if(ticket.getPriority() == level){
                isAvailable = false;
            }
            printMessage();
            return getTechnicalLevel();
        } else if (nextTechnical != null) {
            return nextTechnical.solveTicket(ticket);
        } else {
            System.out.println("Ticket: " + ticket.getDescription() + " -> Ningún técnico disponible. Pendiente de escalamiento.");
            return "Pendiente";
        }
    }

    /**
     * Imprime el mensaje de resolución del técnico.
     */
    public abstract void printMessage();
}
