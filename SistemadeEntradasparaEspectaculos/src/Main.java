import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ticket> tickets = new ArrayList<>();

        tickets.add(new StandardTicket("Rock Concert", 50));
        tickets.add(new StandardTicket("Theater Play", 40));

        tickets.add(new VIPTicket("Music Festival", 100, 0.30));
        tickets.add(new VIPTicket("Award Ceremony", 80, 0.25));

        tickets.add(new DiscountedTicket("Cinema", 20, 0.20));
        tickets.add(new DiscountedTicket("Art Exhibit", 30, 0.15));

        for (Ticket t : tickets) {
            System.out.println("Type: " + t.getClass().getSimpleName());
            System.out.println("Event: " + t.event);
            System.out.println("Base Price: RS." + t.basePrice);
            System.out.println("Final Price: RS." + t.calculateFinalPrice());
            System.out.println();
        }
    }
}