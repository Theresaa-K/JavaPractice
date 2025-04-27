package BroCode.CodeWithMe;

import java.util.Random;

public class RandomPractice {
    public static void main(String[] args) {
        Random random = new Random();

        int number;

        boolean isHeads;

        number = random.nextInt(1,10);

        isHeads = random.nextBoolean();

        System.out.println(number);


        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Talis");
        }

        //System.out.println(Math.PI);

        double result,result2, result3, result4;

        result = Math.pow(2,0); //power
        result2 = Math.abs(-6); //absolute value
        result3 = Math.sqrt(9); //Square root
        result4 = Math.round (3.98); //round

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
