package edu.dosw.lab.util;

public class AdvancedTechnician extends Technical {
    
    @Override
    public boolean solveTicket(Ticket ticket){
        if(ticket.getLevel().equalsIgnoreCase("avanzado")){
            System.out.println("Ticket: " + ticket.getDescription() 
                               + " → Técnico Avanzado resolvió el problema.");
            return true;
    } else if(nextTechnical != null) {
            return nextTechnical.solveTicket(ticket);
        }
        return false;
    }
}
