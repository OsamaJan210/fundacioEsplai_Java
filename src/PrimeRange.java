import java.util.Scanner;

public class PrimeRange {
    public static boolean isPrime(int num){
        boolean flag = true;

        if (num <= 1) {
            flag = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static void PrimeRange(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st number : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the 2nd number : ");
        int num2 = scanner.nextInt();

        for(int i=num1; i<=num2; i++){
            if(isPrime(i)){
                System.out.println(i+" is Prime.");
            }
        }

    }

}
