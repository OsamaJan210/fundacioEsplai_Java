public class TextAnalysis {

    public static void TextAnalysis(String line) {
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
    }
}
