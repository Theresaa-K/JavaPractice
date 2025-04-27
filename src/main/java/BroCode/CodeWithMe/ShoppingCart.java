package BroCode.CodeWithMe;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // SHOPPING CART PROGRAM PRACTICE
        Scanner scanner = new Scanner(System.in);

        String item;
        double price = 15.99;
        int quantity;
        char currency = '$';
        boolean order = false;
        String orderInput;


        System.out.println("Hello welcome to my pizza shop what would you like to order?: \n" +
                "Cheese pizza, Sausage pizza, Pepperoni pizza, Combination pizza, or Veggie pizza.");
        item = scanner.nextLine();

        System.out.println("You chose "+ item + " proceed to Checkout? True or False");
        orderInput = scanner.nextLine(); //reads user input as a string

        if(orderInput.equalsIgnoreCase("true")){
            order = true; //Takes the string and turns into boolean

            System.out.println("How many pizzas do you want?");
            quantity = scanner.nextInt();

            System.out.println("Your total is "+ currency+(quantity * price) + " \nThank you for choosing Kennys pizza");
        }
        else{
            System.out.println("Please select your desired pizza");
        }

        scanner.close();
    }


}
