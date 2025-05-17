import java.util.Scanner;

public class Temperature {
    public static void TemperatureConverter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Temperature in Celsius: ");
        double temperature = scanner.nextDouble();

        System.out.println("Press \n1. for Fahrenheit\n2. for Kelvin");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double fahrenheit = (temperature * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;

            case 2:
                double kelvin = temperature + 273.15;
                System.out.println("Temperature in Kelvin: " + kelvin);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }
    }
}
