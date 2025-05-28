import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VirtualPet pet = null;

        System.out.println("Choose a pet: 1. Dog  2. Cat  3. Hamster");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your pets name: ");
        String petName = scanner.nextLine();

        if (choice == 1) pet = new VirtualDog(petName);
        else if (choice == 2) pet = new VirtualCat(petName);
        else if (choice == 3) pet = new VirtualHamster(petName);
        else {
            System.out.println("Invalid option.");
            return;
        }

        while (true) {
            System.out.println("\nMenu: 1. Eat  2. Play  3. Show Status  4. Exit");
            int action = scanner.nextInt();

            if (action == 1) pet.eat();
            else if (action == 2) pet.play();
            else if (action == 3) pet.showStatus();
            else if (action == 4) break;
            else System.out.println("INvalidd option.");
        }

        System.out.println("Goodbye!");
        scanner.close();

    }
}