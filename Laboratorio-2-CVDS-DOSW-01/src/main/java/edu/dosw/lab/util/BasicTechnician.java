package edu.dosw.lab.util;

public class BasicTechnician extends Technical {
    
    @Override
    public boolean solveTicket(Ticket ticket){
        if(ticket.getLevel().equalsIgnoreCase("básico")
        && ticket.getPriority().equalsIgnoreCase("baja")){
            System.out.println("Ticket: " + ticket.getDescription() 
                               + " → Técnico Básico resolvió el problema.");
            return true;
        } else if (nextTechnical != null) {
            return nextTechnical.solveTicket(ticket);
        }
        return false;
    } 
}
