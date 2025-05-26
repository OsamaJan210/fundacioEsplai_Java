import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosClase2 {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("=============\nFactorial (for): " + Factorial.factorialFor(numero));
        Factorial.testFor();

        System.out.println();

        System.out.println("=============\nFactorial (recursivo): " + Factorial.factorialRecursivo(numero));
        Factorial.testRecursivo();

        System.out.println();

        String palabra = "oso";
        System.out.println("=============\nPalíndromo\n" + "Entrada: " + palabra + "\nSaida: " + Palindrome.esPalindromo(palabra));
        Palindrome.testPalindromo();

        System.out.println();

        System.out.println("=============\nContar Vocales\n" + "Entrada: Hola Mundo " + "\nSaida: " + ContarVocales.contarVocales("Hola Mundo"));

        System.out.println();

        int[] array = {3, 7, 2, 9};
        System.out.println("=============\nLargo Numero\n" + "Entrada: " + Arrays.toString(array) + "\nSaida: " + LargeNumero.largoNumero(array)[0] + "\nPosición: " + LargeNumero.largoNumero(array)[1]);
        LargeNumero.testLargoNumero();

        System.out.println();

        System.out.println("=============\nInvertir un array\n" + "Entrada: " + Arrays.toString(new int[]{1, 2, 3, 4}) + "\nSaida: " + Arrays.toString(ReverseArray.reverseArray(new int[]{1, 2, 3, 4})));
        ReverseArray.testInvertirArray();

        System.out.println();

        System.out.println("=============");
        ArraySorting.sortArray(new int[]{5, 1, 4, 2});

        System.out.println();

        System.out.println("=============");
        Calculator.Calculadora("1,5,+");

        System.out.println();

        System.out.println("=============");
        System.out.println("Password Generator");
        String Password = PasswordGenerator.passwordGenerator();
        System.out.println("Generated Passowrd => " + Password);

        System.out.println();

        System.out.println("=============");
        System.out.println("Scientific Calculator : \n");
        System.out.println(Calculator.ScientificCalculator(25, "sqrt"));
        System.out.println(Calculator.ScientificCalculator(10, 3, "modulo"));
        System.out.println(Calculator.ScientificCalculator(2, 4, "power"));

        System.out.println();

        System.out.println("=============");
        System.out.println("Palindrome Advanced : ");
        System.out.println("La ruta natural");

        if (Palindrome.AdvancedPalindrome("La ruta natural")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println();

        System.out.println("=============");
        System.out.println("Sentence => Hello, Who are you");
        WordCounter.WordCounter("Hello, Who are you");

        System.out.println();

        System.out.println("=============");
        System.out.println("Sentence => casa");
        System.out.println(Replace.Replace("casa"));

        System.out.println();

        System.out.println("=============");
        PrimeRange.PrimeRange();

        System.out.println();

        System.out.println("=============");
        FindWord.FindWord("Me gusta java");

        System.out.println();
//
        System.out.println("=============");

        Temperature.TemperatureConverter();

        System.out.println();

        System.out.println("=============");
        TextAnalysis.TextAnalysis("Anita lava la tina");
        TextAnalysis.testTextAnalysis("Anita lava la tina");

    }
}
