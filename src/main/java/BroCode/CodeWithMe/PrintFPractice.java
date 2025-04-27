package BroCode.CodeWithMe;

public class PrintFPractice {

    // %d = int
    // %s = string
    // %.2f = floating point (2 decimals) printing things for people - like prices
    // %a floating point - when you're printing things for machines or engineers in deep debug mode


    public static void main(String[] args) {
        //printf() is a method used to format output

        //%[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.50;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);


        System.out.printf("%s is %d years old", name, age);

    }
}
