import java.util.Scanner;

public class FindWord {

    public static void FindWord(String line){
        Scanner scanner = new Scanner(System.in);

        String text = line.toLowerCase().replaceAll("[\\p{Punct}]", "");

        System.out.println(line);

        System.out.print("Enter the Word you want to find : ");
        String word = scanner.nextLine();

        String[] words = text.split("[\\s+]");

        for(String wor : words){
            if(wor.equals(word)){
                System.out.println("True");
                return;
            }
        }

        System.out.println("False");

    }
}
