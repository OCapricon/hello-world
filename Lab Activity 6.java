import java.util.Scanner;
import java.io.*;
    public class PIN {
        
    public static void main(String[] a) {
        int attemps = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Pin Code: ");
        int PIN = 0;
        int CORRECT_PIN = 123;
        while(PIN != CORRECT_PIN && attemps < 3)
        {
            PIN  = keyboard.nextInt();
            attemps++;
            if (PIN != CORRECT_PIN && attemps < 3) { 
               System.out.println("PIN incorrect! Try again!");
            }
        }
        if (PIN == CORRECT_PIN && attemps <= 3) {  
            System.out.println("Welcome! Please select an account type");
            myMethod();
        }
         else {
           System.out.println("Account Locked! Please contact the teller for service");
           System.exit(0);
        }
    }
    
    static void myMethod() {
        Scanner s = new Scanner(System.in);
        int user_choice;
        int balance = 45000;
        
        double monthCharge = 0.1 * balance;
        double monthInterest = 0.07 * balance;
        double monthInterest2 = 0.15 * balance;
        double penalty = 0.1 * balance;
        double penalty2 = 0.2 * balance;
        double transCharge = 0.1 * balance;

        System.out.println();
        System.out.println("1) Regular Account");
        System.out.println("2) Interest Account");
        System.out.println("3) Checking Accont");
        System.out.println("4) CD Account");
        System.out.println();
        System.out.print("Enter choice [1-4]: ");
        System.out.println();
        
        user_choice = s.nextInt();
        
        switch (user_choice) {
            case 1: System.out.println("Regular Account Tarrifs: ");
                System.out.println();
                System.out.println("Current Account balance: " +balance);
                if (balance < 50000){
                    System.out.println("Penalty if balance < 50000: " +penalty);
                } else {
                    System.out.println("There is no penalty available for your balance");
                }
                break;
            case 2: System.out.println("\nInterest Account: ");
                System.out.println();
                System.out.println("Current Account balance: " +balance);
                System.out.println("Monthly charge: " +monthCharge);
                System.out.println("Monthly Interest: " +monthInterest);
                System.out.println("No minimum for Interest account");
                    break;
            case 3: System.out.println("Checking Accont: ");
                System.out.println();
                System.out.println("Current Account balance: " +balance);
                System.out.println("Monthly charge: " +monthCharge);
                System.out.println("Monthly Interest: " +monthInterest);
                if (balance < 50000){
                    System.out.println("Penalty if balance < 50000: " +penalty);
                } else {
                    System.out.println("There is no penalty available for your balance");
                }
                    break;
            case 4: System.out.println("CD Account: ");
                System.out.println();
                System.out.println("Current Account balance: " +balance);
                System.out.println("Monthly charge: " +monthCharge);
                System.out.println("Monthly Interest: " +monthInterest2);
                System.out.println("Penalty if withdraw is done before 12 months: " +penalty2);
                    break;
        }
    }
}
    
