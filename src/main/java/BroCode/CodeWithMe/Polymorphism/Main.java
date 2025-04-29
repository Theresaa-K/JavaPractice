package BroCode.CodeWithMe.Polymorphism;

import java.util.Arrays;
import java.util.Scanner;

import static BroCode.CodeWithMe.Polymorphism.Animal.animalType;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello Welcome, would you like to adopt a " + Arrays.toString(animalType) + " (yes/no)");
        String response1 = scanner.nextLine();

        if(response1.equalsIgnoreCase("yes")){
            System.out.println("Good to hear! let's get started!");

            System.out.println("\nThe adoption fee is $150 are you still interested? (Yes/No)");
            String response2 = scanner.nextLine();
            if(response2.equalsIgnoreCase("Yes")){
                System.out.println("Great let's continue!");

                System.out.println("Which animal are you interested in today? "+ Arrays.toString(animalType));
                String response3 = scanner.nextLine();
                if(response3.equalsIgnoreCase("Koala")){
                    System.out.println("Great choice! The "+ response3 + " is a great pet!");
                    Koala.happySound();

                    System.out.println("\nYou return home with your new friend!");
                    Koala.dance();

                    Koala.sleep();
                } else if (response3.equalsIgnoreCase("Cat")){
                    System.out.println("Great choice! The "+ response3 + " is a great pet!");
                    Cat.happySound();
                    Cat.dance();

                    System.out.println("\nYou return home with your new friend!");
                    Cat.sleep();


                }else{
                    System.out.println("Please enter a valid response");
                }


            } else if (response2.equalsIgnoreCase("no")){
                System.out.println("That's too bad, you are welcome to come back anytime!");

            }
        } else if (response1.equalsIgnoreCase("no")){
            System.out.println("That's too bad maybe next time!");


        }
        else {
            System.out.println("Please enter a valid response");
        }
        scanner.close();
    }
}
