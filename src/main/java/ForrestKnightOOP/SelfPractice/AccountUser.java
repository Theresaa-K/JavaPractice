package ForrestKnightOOP.SelfPractice;

import java.util.Scanner;

// To fix this I need to put the Scanner logic in here and call the methods from the BankAccount class.

public class AccountUser extends BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String response1;
        String response2;
        String response3;
        double amount1;
        double amount2;

        System.out.println("Welcome User to your bank account system would you like to see your balance? (yes/no)");
        response1 = scanner.nextLine();
        if (response1.equalsIgnoreCase("yes")) {
            //Enter the balance logic
            BankAccount.viewBalance(BankAccount.getBalance()); // Call the viewBalance method
        } else {
            System.out.println("Okay, would you like to send some money? (yes/no)");
            response2 = scanner.nextLine(); // If the user does not want to see their balance
            if (response2.equalsIgnoreCase("yes")) {
                System.out.println("How much money would you like to send?");
                amount1 = scanner.nextDouble(); // Get the amount to send
                BankAccount.sendMoney(amount1); // Call the sendMoney method
            } else
            { System.out.println("Okay, would you like to take some money out? (yes/no)");
                response3 = scanner.nextLine(); // If the user does not want to send money
                if (response3.equalsIgnoreCase("yes")) {
                    System.out.println("How much money would you like to take out?");
                    amount2 = scanner.nextDouble(); // Get the amount to take out
                    BankAccount.takeOutMoney(amount2); // Call the takeOutMoney method
                }else{
                    System.out.println("You chose to: not see your balance, takeout or send money. Have a good day.");
                }

            }
        }
    }
}



