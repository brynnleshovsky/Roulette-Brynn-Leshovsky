package app;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
          Scanner input = new Scanner(System.in);

        int chips = 100;
         String in = "inside";
         String out = "outside";
         int remainingBets = 10;
         String yes = "yes";
         String no = "no";
         boolean looping = true;
         String red = "red";
         String black = "black";
         String odd= "odd";
         String even = "even";
          System.out.println("Welcome to roulette. You will start with 100 $1 chips");

         while (looping == true){
         System.out.println("Would you like to bet inside or outside?");
         String inOrOut = input.nextLine();
         if (inOrOut.equals(in)){
             System.out.println("Enter a number 1-36 you would like to bet on.");
             int betNum = input.nextInt();
             input.nextLine();
             System.out.println("And how much would you like to bet?");
             int betMon = input.nextInt();
             input.nextLine();
            
         
             System.out.println("Okay. You will bet $" + betMon + " on " + betNum + ".");
             chips = chips - betMon;
             remainingBets = remainingBets -1;
             System.out.println("You have " + chips + " chips remaining.");
         }
         

             else if (inOrOut.equals(out)){
                 System.out.println("would you like to bet even, odd, black, or red?");
                 String outBet = input.nextLine();
                 if (outBet.equals(red)){
                     System.out.println("And how much would you like to bet?");
                     int betMon = input.nextInt();
                     input.nextLine();
                     System.out.println("Okay. You will bet $" + betMon + " on " + red + ".");
                     remainingBets = remainingBets -1;
                     chips = chips - betMon;
                     System.out.println("You have " + chips + " chips remaining.");
                 }
                 if (outBet.equals(black)){
                     System.out.println("And how much would you like to bet?");
                     int betMon = input.nextInt();
                     input.nextLine();
                     System.out.println("Okay. You will bet $" + betMon + " on " + black + ".");
                     remainingBets = remainingBets -1;
                     chips = chips - betMon;
                     System.out.println("You have " + chips + " chips remaining.");
                 }
                 if (outBet.equals(odd)){
                     System.out.println("And how much would you like to bet?");
                     int betMon = input.nextInt();
                     input.nextLine();
                     System.out.println("Okay. You will bet $" + betMon + " on " + odd + ".");
                     remainingBets = remainingBets -1;
                     chips = chips - betMon;
                     System.out.println("You have " + chips + " chips remaining.");
                 }
                 if (outBet.equals(even)){
                     System.out.println("And how much would you like to bet?");
                     int betMon = input.nextInt();
                     input.nextLine();
                     System.out.println("Okay. You will bet $" + betMon + " on " + even + ".");
                     remainingBets = remainingBets -1;
                     chips = chips - betMon;
                     System.out.println("You have " + chips + " chips remaining.");
                 }
             }
             System.out.println("Would you like to make another bet? You have " + remainingBets + " left.");
         String secondBet = input.nextLine();
         if (secondBet.equals(yes)){
             System.out.println("check");
         }
         else if (secondBet.equals(no)){
             System.out.println("Betting is now complete.");
             System.out.println("Spinning...");
              Random rnd = new Random(); 
         // 0 to 36
         int n1 = rnd.nextInt(37); 
         System.out.println("The number is " + n1);
         System.out.println("would you like to spin again?");
         String again = input.nextLine();
         
         if (again.equals(no)){
             looping = false;
             System.out.println("you cashed out with ");
         }
         else{
             System.out.println("okay.");
         }
         }
         } 
        }
    }
