public  class DiscountedTicket extends Ticket {
    double discountRate;

    DiscountedTicket(String event, double basePrice, double discountRate) {
        super(event, basePrice);
        this.discountRate = discountRate;
    }

    @Override
    double calculateFinalPrice() {
        return basePrice - (basePrice * discountRate);
    }
}