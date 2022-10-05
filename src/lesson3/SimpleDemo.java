package lesson3;

import java.util.Random;

public class SimpleDemo {

    public static void main(String[] args) {

        Random random = new Random();

        int d = random.nextInt(100);

        int x = 5;
//        double d = 3.5;

//        double result = x + d;

        System.out.println("==========");
        System.out.println( d);
    }
}
