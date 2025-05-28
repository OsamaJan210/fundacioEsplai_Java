import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota", 2020));
        vehicles.add(new Motorcycle("Yamaha", 2018));
        vehicles.add(new Bicycle("Sohrab", 1965));
        vehicles.add(new Car("Honda", 2019));
        vehicles.add(new Bicycle("Tomo", 2023));

        for (Vehicle v : vehicles) {
            System.out.println(v.brand + " " + v.year);
            v.start();
            v.stop();
            System.out.println();
        }
    }
}