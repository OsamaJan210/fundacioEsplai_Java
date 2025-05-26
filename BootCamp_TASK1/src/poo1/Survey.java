package poo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Survey {

    Scanner sc = new Scanner(System.in);
    List<Question> questions=new ArrayList<>();
    public void createServey(){
        System.out.println("Creating a new Survey");
        addQuestion(new Question("What is Capital of Spain", Arrays.asList("Madrid", "Barcelona","Valencia")));
        addQuestion(new Question("What is Capital of Pakistan", Arrays.asList("Madrid", "Islambad","Valencia")));
        addQuestion(new Question("What is Capital of India", Arrays.asList("Madrid", "Barcelona","Bombay")));
    }
    public void addQuestion(Question question){
        questions.add(question);
    }

    public  void conductSurvey() {
        createServey();

        System.out.println("Conducting survey");
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);

            System.out.println("\n" + (i + 1) + ". " + q.text);
            for (int j = 0; j < q.options.size(); j++) {
                System.out.println("  " + (j + 1) + ". " + q.options.get(j));
            }
            int choice;
            while (true) {
                System.out.print("Choose option (1-" + q.options.size() + "): ");
                choice = sc.nextInt();
                if (choice >= 1 && choice <= q.options.size()) break;
                System.out.println("Invalid option. Try again.");
            }

            q.vote(q.options.get(choice - 1));
            System.out.println("\nSurvey complete. Thank you!");
        }
    }
    public void showAllStatistics() {
        System.out.println("\n--- Survey Statistics ---");
        for (Question q : questions) {
            q.showStatistics();
            System.out.println();
        }
    }}
