import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un Número : ");
        int enteredNumber = scanner.nextInt();
        fizzBuzz.fizzBuzz(enteredNumber);
    }
}