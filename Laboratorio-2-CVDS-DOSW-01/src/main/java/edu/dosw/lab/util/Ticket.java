package edu.dosw.lab.util;

public class Ticket {
    private String level;
    private String priority;
    private String description;

    public Ticket(String level, String priority, String description){
        this.level = level;
        this.priority = priority;
        this.description = description;
    }

    public String getLevel() {
        return level;
    }

    public String getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}
