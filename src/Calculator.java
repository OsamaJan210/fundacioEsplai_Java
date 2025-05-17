public class Calculator {

    public static void Calculadora(String frase) {
        System.out.println("Demanded" + frase);
        String[] myArray = frase.split(",");

        switch (myArray[2]) {
            case "+":
                System.out.println(Integer.valueOf(myArray[0]) + Integer.valueOf(myArray[1]));
                break;
            case "-":
                System.out.println(Integer.valueOf(myArray[0]) - Integer.valueOf(myArray[1]));
                break;
            case "*":
                System.out.println(Integer.valueOf(myArray[0]) * Integer.valueOf(myArray[1]));
                break;
            case "/":
                System.out.println(Integer.valueOf(myArray[0]) / Integer.valueOf(myArray[1]));
                break;

        }
    }

    public static double ScientificCalculator(int num1, String operation) {
        if (operation.toLowerCase().trim().equals("sqrt")) {
            return Math.sqrt(num1);
        }
        return -1;
    }

    public static double ScientificCalculator(int num1, int num2, String operation) {
        if (operation.toLowerCase().trim().equals("modulo")) {
            return num1 % num2;
        } else if (operation.toLowerCase().trim().equals("power")) {
            return Math.pow(num1, num2);
        }
        return -1;
    }
}
