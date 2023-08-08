package com.techzenure.day5;



import java.util.Scanner;

class Ticket {
    private int ticketid;
    private int price;
    private static int availableTickets;

    public Ticket() {
    }

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if (availableTickets >= 0) {
            Ticket.availableTickets = availableTickets;
        } else {
            System.out.println("Available tickets should be a positive value.");
        }
    }

    public int calculateTicketCost(int nooftickets) {
        if (nooftickets <= availableTickets) {
            availableTickets -= nooftickets;
            return nooftickets * price;
        } else {
            return -1;
        }
    }
}

 class TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of bookings: ");
        int noOfBookings = sc.nextInt();

        System.out.print("Enter the available tickets: ");
        int availableTickets = sc.nextInt();
        Ticket.setAvailableTickets(availableTickets);

        for (int i = 0; i < noOfBookings; i++) {
            Ticket ticket = new Ticket();

            System.out.print("Enter the ticketid: ");
            int ticketid = sc.nextInt();
            ticket.setTicketid(ticketid);

            System.out.print("Enter the price: ");
            int price = sc.nextInt();
            ticket.setPrice(price);

            System.out.print("Enter the no of tickets: ");
            int nooftickets = sc.nextInt();

            int totalAmount = ticket.calculateTicketCost(nooftickets);

            if (totalAmount != -1) {
                System.out.println("\nAvailable tickets: " + Ticket.getAvailableTickets());
                System.out.println("Total amount: " + totalAmount);
                System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
            } else {
                System.out.println("Tickets are not available for booking.");
            }
            
        }
    }
}




