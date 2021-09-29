package lesson3;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {

    static Random random = new Random();
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of roles: ");
        int userInput = input.nextInt();

        rollDice(userInput);
    }


    public static void  rollDice(int nRolls) {

        for (int i=0; i<nRolls; i++){
            int dice1 = random.nextInt(6)+1;
            int dice2 = random.nextInt(6)+1;

            System.out.println("( " + dice1 + " , " + dice2 + " )");
        }

    }
}
