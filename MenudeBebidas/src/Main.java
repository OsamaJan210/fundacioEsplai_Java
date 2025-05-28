import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Drink> menu = new ArrayList<>();
        menu.add(new Soda("Coca-Cola", "500ml", true));
        menu.add(new Juice("Orange Juice", "300ml", "Orange"));
        menu.add(new Water("Spring Water", "750ml", true));
        menu.add(new Juice("Apple Juice", "250ml", "Apple"));
        menu.add(new Soda("Pepsi", "330ml", false));
        menu.add(new Water("Tap Water", "500ml", false));

        for (Drink drink : menu) {
            System.out.println(drink.getDescription());
        }
    }
}