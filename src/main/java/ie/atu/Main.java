package ie.atu;

import ie.atu.demo.EarlyBirdTicket;
import ie.atu.demo.StudentTicket;
import ie.atu.demo.Ticket;
import ie.atu.demo.VIPTicket;

public class Main {
    public static void main(String[] args) {
        String eventName = "Summer Concert";
        String holderName = "Holder Holdings";
        double basePrice = 7;

        Ticket alice = new Ticket(eventName, holderName, basePrice);
        StudentTicket bob = new StudentTicket(eventName, holderName, basePrice, "S12345");
        VIPTicket charlie = new VIPTicket(eventName, holderName, basePrice);

        EarlyBirdTicket bird = new EarlyBirdTicket(eventName, holderName, basePrice);

        System.out.println("Event name: " + eventName);
        System.out.println("Holder name: " + holderName);
        System.out.println("Base price: " + basePrice);

        System.out.println();

        System.out.println("Standard Ticket - Alice: €" + alice.calculatePrice());
        System.out.println("Student Ticket - Bob: €" + bob.calculatePrice());
        System.out.println("VIP Ticket - Charlie: €" + charlie.calculatePrice());
        System.out.println("Early Bird Ticket - Birdie: €" + bird.calculatePrice());

        System.out.println();

        System.out.println("Student ID: " + bob.getStudentId());
        System.out.println("Benefits: " + charlie.getBenefits());
    }
}