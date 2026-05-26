package com.day5proj2.services;

import com.day5proj2.models.Ticket;
import com.day5proj2.models.User;
import com.day5proj2.exceptions.InvalidAgeException;
import com.day5proj2.exceptions.InvalidTitleException;

import java.util.*;

public class TicketService {
    private List<Ticket> tickets = new ArrayList<>();


    public void addTicket(Ticket ticket) throws Exception {
        if (ticket.getUser().getAge() < 18) {
            throw new InvalidAgeException("User is less than age 18. User age: " + ticket.getUser().getAge());
        }

        if (ticket.getTitle().isEmpty()) {
            throw new InvalidTitleException("The ticket title must not be empty!. Ticket id: " + ticket.getTicket_id());
        }

        tickets.add(ticket);
    }

    public void displayTickets() {
        for (Ticket ticket : tickets) {
            User user = ticket.getUser();
            System.out.println("--------Ticket Details---------");
            System.out.println("Ticket ID: " + ticket.getTicket_id());
            System.out.println("Ticket Title: " + ticket.getTitle());
            System.out.println("Username: " + user.getName());
            System.out.println("Age: " + user.getAge());
        }
    }
}
