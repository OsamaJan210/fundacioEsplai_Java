public class Palindrome {

    public static boolean esPalindromo(String palabra) {
        String reverso = new StringBuilder(palabra).reverse().toString();
        return palabra.equals(reverso);
    }

    public static boolean AdvancedPalindrome(String line){
        String clean = line.toLowerCase().replaceAll("[\\p{Punct}\\s]", "");
        return esPalindromo(clean);
    }

    public static void testPalindromo() {
        if (!Test.assertEquals("true", String.valueOf(esPalindromo("oso")))) {
            System.err.println("Test Fail: esPalindromo(\"oso\") should be true");
            return;
        }

        if (!Test.assertEquals("true", String.valueOf(esPalindromo("pop")))) {
            System.err.println("Test Fail: esPalindromo(\"pop\") should be true");
            return;
        }

        if (!Test.assertEquals("false", String.valueOf(esPalindromo("osama")))) {
            System.err.println("Test Fail: esPalindromo(\"osama\") should be false");
            return;
        }

        if (!Test.assertEquals("true", String.valueOf(esPalindromo("12321")))) {
            System.err.println("Test Fail: esPalindromo(\"12321\") should be true");
            return;
        }

        if (!Test.assertEquals("false", String.valueOf(esPalindromo("12345")))) {
            System.err.println("Test Fail: esPalindromo(\"12345\") should be false");
            return;
        }

        System.out.println("All tests passed for esPalindromo");
    }
}
