package BroCode.CodeWithMe;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favorite color? ");
        String favColor = scanner.nextLine();

        System.out.println("What is your gpa? ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();



        System.out.println("Hello, "+ name);
        System.out.println("You are "+ age+ " years old.");
        System.out.println("Your gpa is "+ gpa);
        System.out.println("Your favorite color is "+ favColor);

        if(isStudent){
            System.out.println("You are a enrolled as a STUDENT");
        }
        else {
            System.out.println("You are NOT enrolled");
        }

        scanner.close();
    }
}
