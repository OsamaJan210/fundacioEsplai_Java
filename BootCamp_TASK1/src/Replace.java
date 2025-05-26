import java.util.Scanner;

public class Replace {

    public static String Replace(String line){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which Word you want to replace : ");
        char ch1 = scanner.next().charAt(0);

        System.out.print("What Word you want to put : ");
        char ch2 = scanner.next().charAt(0);

        StringBuilder modifiedLine = new StringBuilder();

        for(int i=0; i<line.length(); i++){
            char letter = line.charAt(i);
            if(letter == ch1){
                modifiedLine.append(ch2);
            }else {
                modifiedLine.append(letter);
            }
        }

        return modifiedLine.toString();

    }
}
