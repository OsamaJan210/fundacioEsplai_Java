public class VIPTicket extends Ticket {
    double vipSurcharge;

    VIPTicket(String event, double basePrice, double vipSurcharge) {
        super(event, basePrice);
        this.vipSurcharge = vipSurcharge;
    }

    @Override
    double calculateFinalPrice() {
        return basePrice + (basePrice * vipSurcharge);
    }
}