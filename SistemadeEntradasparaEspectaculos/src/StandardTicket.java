public class StandardTicket extends Ticket {
    StandardTicket(String event, double basePrice) {
        super(event, basePrice);
    }

    @Override
    double calculateFinalPrice() {
        return basePrice;
    }
}
