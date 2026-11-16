package ie.atu.demo;

import static java.lang.Math.max;

public class EarlyBirdTicket extends Ticket {
    public EarlyBirdTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);
    }

    @Override
    public double calculatePrice() {
        return max(getBasePrice() - 10, 0);
    }
}
