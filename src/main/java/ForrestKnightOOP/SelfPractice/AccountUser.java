package ForrestKnightOOP.SelfPractice;

import java.util.Scanner;

// To fix this I need to put the Scanner logic in here and call the methods from the BankAccount class.

public class AccountUser extends BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String response1;
        String response2;
        String response3;
        String response4;
        double amount1;
        double amount2;

        System.out.println("Welcome User to your bank account system would you like to see your balance? (yes/no)");
        response1 = scanner.nextLine();
        if (response1.equalsIgnoreCase("yes")) {
            //Enter the balance logic
            BankAccount.viewBalance(BankAccount.getBalance()); // Call the viewBalance method
            System.out.println("\nOkay, would you like to send some money? (yes/no)");
            response2 = scanner.nextLine(); // If the user does not want to see their balance
            if (response2.equalsIgnoreCase("yes")) {
                System.out.println("How much money would you like to send?");
                amount1 = scanner.nextDouble(); // Get the amount to send
                System.out.println("Who you would like to send the money to: Please enter the name and phone number of the person you are sending money to.");
                response4 = scanner.next(); // Get the name of the person to send money to

                System.out.println("You have selected: "+ response4 );
                BankAccount.sendMoney(amount1); // Call the sendMoney method
            } else
            { System.out.println("Okay, would you like to take some money out? (yes/no)");
                response3 = scanner.nextLine(); // If the user does not want to send money
                if (response3.equalsIgnoreCase("yes")) {
                    System.out.println("How much money would you like to take out?");
                    amount2 = scanner.nextDouble(); // Get the amount to take out
                    BankAccount.takeOutMoney(amount2); // Call the takeOutMoney method
        } else  {
                    System.out.println("Okay, have a nice day!");
                }
            }
        } else {
            System.out.println("Okay, have a nice day!"); // If the user does not want to see their balance
        }
    }
}



