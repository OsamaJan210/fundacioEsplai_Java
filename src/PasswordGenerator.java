import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static String passwordGenerator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the password length: ");
        int length = scanner.nextInt();

        System.out.print("Include special characters? (yes/no): ");
        String includeSpecial = scanner.next().trim().toLowerCase();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

        String characterSet = upper + lower + digits;

        if (includeSpecial.equals("yes")) {
            characterSet += special;
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(index));
        }

        return password.toString();
    }
}
