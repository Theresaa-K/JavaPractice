package BroCode.CodeWithMe;

public class StringMethods {

    public static void main(String[] args) {
        String name = "Theresa Kenny";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("y");
        int lastIndex = name.lastIndexOf("a");

        name = name.toUpperCase();

        System.out.println(index);
    }



}
