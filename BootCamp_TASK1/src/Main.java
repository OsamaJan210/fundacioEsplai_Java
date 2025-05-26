import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Scanner scanner = new Scanner(System.in);


    public void sum() {

        System.out.println("\n\nAddition Task");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("The sum is: " + sum);


    }
    public void isPrime(){

        System.out.println("\n\nPrime Number Task");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Using ternary operator
        System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));

    }
    public void introduce(){
        System.out.println("\n\nIntroduction Task");
        System.out.print("I have good knowlege of programing concepts like OOP and \n" +
                "also have hand on experince with FullStack development \n" +
                "I have hand on Experince with Java Springboot, Angular for Frontend Development and Postgres for Data Bases\n" +
                "Also have Practicel Knowledge for Hybernate, JAPA, Microservices\n" +
                "1. VariAble are used to store data\n" +
                "2. funciones are use as a block of cade that can be re useable.\n" +
                "3. recursividad the function that call its self.\n" +
                "4. loops are used to exectuten until condition is satisfied\n" +
                "5. condicionales are use to make decisions in code.\n" +
                "6. JSON formate to zxchange Data.\n" +
                "7. XML MarkupLAnguage to Structure Data.\n" +
                "8. HTML MarkupLAnguage for WebPAges\n" +
                "9. Classes Actually it is A Blue print Templates for creating objects with properties and methods.\n" +
                "10.Inheritance One class derives from another, inheriting its functunality.\n" +
                "11. SQL (Structured Query Language) used to intract with dtatabase\n" +
                "12. Query use to perfom operation on Data base\n" +
                "13. Commit A Version control system  functionality to save changes to version\n" +
                "14. Pull Request it is created to review code before merging\n" +
                "15. API is allowing system to do communication Like RestAPI is used to fethc data from  backend and show on front end to user side.");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");

        Main main = new Main();
        main.sum();
        main.isPrime();

        main.introduce();
        FizzBuzz fizzBuzz = new FizzBuzz();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nFizzBuzz\nIntroduzca un Número : ");
        int enteredNumber = scanner.nextInt();
        fizzBuzz.fizzBuzz(enteredNumber);
    }
}