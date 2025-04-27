package BroCode.CodeWithMe;

import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        //Mad Libs game

        Scanner scanner = new Scanner(System.in);

        String adjective1; //describes something ex: Fast, Slow, Cheap est
        String noun1; //Is a person, place, or thing
        String adjective2;
        String verb1; //is an action ex: Sleeping, swimming
        String adjective3;

        System.out.println("Enter an adjective (description)");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun (animal or person)");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (description)");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb ending with -ing (action)");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (description)");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to a "+ adjective1+ " zoo");
        System.out.println("In an exhibit, I saw a "+ noun1+".");
        System.out.println(noun1 +" was "+ adjective2+" and "+ verb1+" ! ");
        System.out.println("I was "+ adjective3+"!");

        scanner.close();






    }
}
