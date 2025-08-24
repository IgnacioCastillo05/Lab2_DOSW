package edu.dosw.lab.util;

public class IntermediateTechnician extends Technical {
    
    @Override
    public boolean solveTicket(Ticket ticket){
        if(ticket.getLevel().equalsIgnoreCase("intermedio")
        && !ticket.getPriority().equalsIgnoreCase("alta")){
            System.out.println("Ticket: " + ticket.getDescription() 
                               + " → Técnico Intermedio resolvió el problema.");
            return true;
        } else if (nextTechnical != null) {
            return nextTechnical.solveTicket(ticket);
        }
        return false;
    } 
}

