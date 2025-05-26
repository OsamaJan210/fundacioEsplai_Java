public class WordCounter {

    public static void WordCounter(String text) {
        String line = text.toLowerCase();

        int words = 1;
        int vowelsStart = 0;

        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if (letter == ' ') {
                words++;
                if (i < line.length() - 1) {
                    char NextLetter = line.charAt(i + 1);
                    if (NextLetter == 'a' ||
                            NextLetter == 'e' ||
                            NextLetter == 'i' ||
                            NextLetter == 'o' ||
                            NextLetter == 'u') {
                        vowelsStart++;
                    }
                }
            }
        }

        System.out.println("Total Words => " + words);
        System.out.println("Words Start From Vowels => " + vowelsStart);

    }
}
