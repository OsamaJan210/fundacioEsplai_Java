import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Platform {
    public static ArrayList<Player> playersList = new ArrayList<>();
    public static ArrayList<Games> gamesList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, price, age;
        String name, developer, currentPlayer, selectedGame;
        Player foundPlayer;
        Games foundGame;

        do {
            System.out.println("\n===== Video Game Platform Menu =====");
            System.out.println("1. Register new video game");
            System.out.println("2. Register new player");
            System.out.println("3. Buy video game for a player");
            System.out.println("4. Simulate playing");
            System.out.println("5. View game catalog");
            System.out.println("6. View player statistics");
            System.out.println("7. View hours played ranking");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(scanner.nextLine()); // use nextLine to avoid newline issues

            switch (choice) {
                case 1:
                    System.out.println("\nRegistering a new video game...");
                    System.out.print("Enter Game Name: ");
                    name = scanner.nextLine();

                    System.out.print("Enter Game Price: ");
                    price = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter Developer Name: ");
                    developer = scanner.nextLine();

                    Games game = new Games(name, developer, price);
                    gamesList.add(game);
                    System.out.println("Game registered successfully!");
                    break;

                case 2:
                    System.out.println("\nRegistering a new player...");
                    System.out.print("Enter Player Name: ");
                    name = scanner.nextLine();

                    System.out.print("Enter Player Age: ");
                    age = Integer.parseInt(scanner.nextLine());

                    Player newPlayer = new Player(name, age);
                    playersList.add(newPlayer);
                    System.out.println("Player registered successfully!");
                    break;

                case 3:
                    System.out.println("\nBuying video game for a player...");
                    System.out.println("Registered Players:");
                    for (Player player : playersList) {
                        System.out.println("- " + player.getName());
                    }

                    System.out.print("Enter the name of Player to select: ");
                    currentPlayer = scanner.nextLine();

                    foundPlayer = null;
                    for (Player p : playersList) {
                        if (p.getName().equalsIgnoreCase(currentPlayer)) {
                            foundPlayer = p;
                            break;
                        }
                    }

                    if (foundPlayer == null) {
                        System.out.println("Player not found!");
                        break;
                    }

                    System.out.println("\nAvailable Games:");
                    for (Games g : gamesList) {
                        System.out.println("- " + g.getName() + " | Price: " + g.getPrice() + " | Developer: " + g.getDeveloper());
                    }

                    System.out.print("Enter the name of Game to purchase: ");
                    selectedGame = scanner.nextLine();

                    foundGame = null;
                    for (Games g : gamesList) {
                        if (g.getName().equalsIgnoreCase(selectedGame)) {
                            foundGame = g;
                            break;
                        }
                    }

                    if (foundGame == null) {
                        System.out.println("Game not found!");
                        break;
                    }

                    foundPlayer.purchaseGame(foundGame);
                    System.out.println("Game purchased successfully!");
                    break;

                case 4:
                    System.out.println("Simulating playing...");

                    System.out.println("Registered Players:");
                    for (Player player : playersList) {
                        System.out.println("- " + player.getName());
                    }

                    System.out.print("Enter the name of Player to select: ");
                    currentPlayer = scanner.nextLine();

                    foundPlayer = null;
                    for (Player p : playersList) {
                        if (p.getName().equalsIgnoreCase(currentPlayer)) {
                            foundPlayer = p;
                            break;
                        }
                    }

                    if (foundPlayer == null) {
                        System.out.println("Player not found!");
                        break;
                    }

                    System.out.println("\nAvailable Games:");
                    for (Games g : gamesList) {
                        System.out.println("- " + g.getName() + " | Price: " + g.getPrice() + " | Developer: " + g.getDeveloper());
                    }

                    System.out.print("Enter the name of Game to purchase: ");
                    selectedGame = scanner.nextLine();

                    foundGame = null;
                    for (Games g : gamesList) {
                        if (g.getName().equalsIgnoreCase(selectedGame)) {
                            foundGame = g;
                            break;
                        }
                    }

                    if (foundGame == null) {
                        System.out.println("Game not found!");
                        break;
                    }

                    foundPlayer.playGame(foundGame, 1);
                    System.out.println("Game Playing ");
                    break;

                case 5:
                    System.out.println("\nGame Catalog:");
                    for (Games g : gamesList) {
                        System.out.println(g);
                    }
                    break;

                case 6:
                    System.out.println("\nPlayer Statistics:");
                    System.out.println("_____________________________");
                    for (Player p : playersList) {
                        p.showStats();
                        System.out.println("_____________________________");
                    }
                    System.out.println("_____________________________");
                    break;

                case 7:
                    System.out.println("\n=== Hours Played Ranking ===");

                    // Create a copy of the players list to sort
                    ArrayList<Player> sortedPlayers = new ArrayList<>(playersList);

                    // Simple bubble sort based on total hours played (descending)
                    for (int i = 0; i < sortedPlayers.size() - 1; i++) {
                        for (int j = 0; j < sortedPlayers.size() - i - 1; j++) {
                            if (sortedPlayers.get(j).getTotalHoursPlayed() < sortedPlayers.get(j + 1).getTotalHoursPlayed()) {
                                // Swap players
                                Player temp = sortedPlayers.get(j);
                                sortedPlayers.set(j, sortedPlayers.get(j + 1));
                                sortedPlayers.set(j + 1, temp);
                            }
                        }
                    }

                    // Print ranking
                    for (Player player : sortedPlayers) {
                        System.out.println(player.getName() + " | Total Hours Played: " + player.getTotalHoursPlayed());
                    }

                    break;


                case 8:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 8);
    }
}
