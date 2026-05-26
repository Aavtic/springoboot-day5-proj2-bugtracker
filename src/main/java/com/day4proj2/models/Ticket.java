package com.day5proj2.models;

public class Ticket {
    private int ticket_id;
    private String title;
    private User user;
    
    public Ticket(int ticket_id, String title, User user) {
        this.ticket_id = ticket_id;
        this.title = title;
        this.user = user;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
