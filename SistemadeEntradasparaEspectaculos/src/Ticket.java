public abstract class Ticket {
    String event;
    double basePrice;

    Ticket(String event, double basePrice) {
        this.event = event;
        this.basePrice = basePrice;
    }

    abstract double calculateFinalPrice();
}
