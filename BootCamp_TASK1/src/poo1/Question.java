package poo1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Question {
    String text;
    List<String> options;
    Map<String, Integer> optionCount = new LinkedHashMap<>();

    public Question(String text, List<String> options) {
        this.text = text;
        this.options = options;
        for (String option : options) {
            optionCount.put(option, 0);
        }
    }

    public void vote(String option) {
        optionCount.put(option, optionCount.get(option) + 1);
    }

    public void showStatistics() {
        System.out.println("Question: " + text);
        String topOption = null;
        int maxVotes = -1;
        for (Map.Entry<String, Integer> entry : optionCount.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue() + " votes");
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                topOption = entry.getKey();
            }
        }
        System.out.println("  Most voted: " + topOption + " (" + maxVotes + " votes)");
    }


}
