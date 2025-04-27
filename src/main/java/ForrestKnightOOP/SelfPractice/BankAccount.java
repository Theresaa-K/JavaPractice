package ForrestKnightOOP.SelfPractice;
//To fix this I need to put the BankAccount logic in here
// Logic to IF statements to check if the user wants to see their balance

public class BankAccount {
    //I want to create a bank account class that can send money, accept money, and buy stuff.
    //I will be using encapsulation to hide the balance
    //And I will use a scanner to get user input for the amount total and if they want to send money
    // or take some out and or buy something.

    private static double balance = 900;


    public static double getBalance() {
        return balance; //Getter method to access the private balance attribute
    }

    public static void viewBalance(double balance) {
        System.out.println("Your current balance is: " + "$" + balance);
    }

    public static void sendMoney(double amount){
        if (amount > balance){
            System.out.println("You do not have enough money to send that amount.");
        }else {
            System.out.println("You have sent: "+ "$"+amount + " Your new balance is "+ "$"+(balance - amount));
        }
    }
    public static void takeOutMoney(double amount){
        if (amount > balance){
            System.out.println("You do not have enough money to take out that amount.");
        }
        else {
            System.out.println("You have taken out: "+ "$"+amount+ " Your new balance is: "+ "$"+(balance - amount));
        }
    }

    }


