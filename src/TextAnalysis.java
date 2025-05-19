import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextAnalysis {

    public static String TextAnalysis(String line) {
        int No_of_characters = line.length();
        int No_of_words = 0;
        int No_of_vowels = 0;
        String longestWord = "";

        String text = line.toLowerCase().replaceAll("[\\p{Punct}]", "");
        String text2 = line.toLowerCase().replaceAll("[\\p{Punct}\\s]", "");
        String[] words = text.trim().split("\\s+");
        No_of_words = words.length;

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }

            for (char c : word.toCharArray()) {
                switch (c) {
                    case 'a', 'e', 'i', 'o', 'u':
                        No_of_vowels++;
                        break;
                }
            }
        }

        // Output the results
        System.out.println("Characters: " + No_of_characters);
        System.out.println("Words: " + No_of_words);
        System.out.println("Longest word: '" + longestWord + "'");
        System.out.println("Vowels: " + No_of_vowels);
        System.out.println("Is Palindrome " + Palindrome.esPalindromo(text2));

        System.out.println("Bonus:");
        export(line);
        return No_of_characters+","+No_of_words+","+longestWord+","+No_of_vowels+","+
                String.valueOf(Palindrome.esPalindromo(text2));

    }
    private static void export(String text) {
        String filePath="D://text.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(text);
            System.out.println("File Saved to  " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static void testTextAnalysis(String frase){
        System.out.println(TextAnalysis(frase));
        if (!Test.assertEquals("18,4,anita,8,true", String.valueOf(TextAnalysis("Anita lava la tina")))) {
            System.err.println("Test Fail: Text Analysis failed");
            return;
        }
        System.out.println("Test Pass: Text Analysis passed");

    }

}
