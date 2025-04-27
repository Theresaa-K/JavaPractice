package BroCode.CodeWithMe;

import java.util.Scanner;

public class UserInputPractice {
    public static void main(String[] args) {

        //calculate the area of a rectangle

        double width = 0;
        double height= 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        width= scanner.nextDouble(); //Takes in user input for width

        System.out.println("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height; //calculates the formula

        System.out.println("The area is: "+ area);


        scanner.close();
    }
}
