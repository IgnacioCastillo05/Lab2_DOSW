
/**
 * Técnico intermedio. Solo resuelve tickets de nivel 2 y prioridad 1 o 2.
 */
public class IntermediateTechnician extends Technical {
	/**
	 * Constructor: asigna el nivel 2 al técnico intermedio.
	 */
	public IntermediateTechnician() {
		this.level = 2;
	}

	/**
	 * Imprime el mensaje de resolución para el técnico intermedio.
	 */
	@Override
	public void printMessage() {
		System.out.println("Ticket resuelto por el Técnico Intermedio.");
	}

	/**
	 * Solo resuelve tickets de nivel 2 y prioridad 1 o 2.
	 */
	@Override
	public boolean puedeResolver(Ticket ticket) {
		return ticket.getLevel() == 2 && ticket.getPriority() <= 2;
	}

	/**
	 * Devuelve el nombre del nivel del técnico.
	 */
	@Override
	public String getTechnicalLevel() {
		return "Intermedio";
	}
}

