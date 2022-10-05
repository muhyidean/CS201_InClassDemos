package lesson3;


import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        /*
        Task1

        Ask the user to roll the dice a number of times and print them out.
        Assuming there are two dices on each roll
         */

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("==================");
        System.out.println("How many times would you like to roll the dices:");
        int numberOfRolls = input.nextInt();

        for (int i = 0; i < numberOfRolls; i++) {
            int d1 = random.nextInt(6)+1; // 1-6
            int d2 = random.nextInt(6)+1; // 1-6

            System.out.println("(" + d1 + " , " + d2 + ")");
        }


    }
}
