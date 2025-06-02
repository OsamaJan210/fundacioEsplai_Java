import java.util.HashMap;
import java.util.Map;

public class Player {

    private String name;
    private int age;
    private Map<Games, Integer> purchasedGames = new HashMap<>();


    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<Games, Integer> getPurchasedGames() {
        return purchasedGames;
    }

    public void purchaseGame(Games game) {
        purchasedGames.putIfAbsent(game, 0);
    }

    public void playGame(Games game, int hours) {
        if (purchasedGames.containsKey(game)) {
            int totalHours = purchasedGames.get(game);
            purchasedGames.put(game, totalHours + hours);
        } else {
            System.out.println(name + " has not purchased this game.");
        }
    }

    public void showStats() {
        System.out.println("Player: " + name);
        for (Map.Entry<Games, Integer> entry : purchasedGames.entrySet()) {
            System.out.println("Game: " + entry.getKey().getName() + ", Hours Played: " + entry.getValue());
        }
    }

    public int getTotalHoursPlayed() {
        int total = 0;
        for (int hours : purchasedGames.values()) {
            total += hours;
        }
        return total;
    }

}
