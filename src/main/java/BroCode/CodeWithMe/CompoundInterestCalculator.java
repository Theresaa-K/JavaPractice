package BroCode.CodeWithMe;

import java.util.Scanner;

public class CompoundInterestCalculator {
    // %d = int
    // %s = string
    // %.2f = floating point (2 decimals) printing things for people - like prices
    // %a floating point - when you're printing things for machines or engineers in deep debug mode

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;


        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate: ");
        rate = scanner.nextDouble() /100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years); //Compound interest formula

        //System.out.println("The amount after "+ years + "is: $"+ amount);
        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();
    }
}
