package edu.dosw.lab.util;

public abstract class Technical {
    protected Technical nextTechnical;

    public void setNextTechnical(Technical nextTechnical) {
        this.nextTechnical = nextTechnical;
    }

    public abstract boolean solveTicket(Ticket ticket);
}
