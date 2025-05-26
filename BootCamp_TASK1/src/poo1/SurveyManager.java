package poo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SurveyManager {

   public static void main(String[] args) {
       Survey survey = new Survey();
       List<String> list = new ArrayList<String>();
       list.add("osama");
       list.add("sam");
       list.add("jhon");
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your username to login: ");
       String username = sc.nextLine();

       if (list.contains(username)) {
           System.out.println("You are logged in!\nStart Survey for :   "+username);
           survey.conductSurvey();

           survey.showAllStatistics();
       }
       else {
           System.out.println("You are not logged in!");
       }
   }


}
