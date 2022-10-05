package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    /*
    Task 2
    Write a code that will ask the user to select 'H' or 'T' and toss a coin 3 times
    The program should output "You're lucky" if the number of the selected option  is 2 or greater.
    Otherwise, it should print "Try again..."


    Example below
    =======================
    User selection --> H
    example
    H
    H
    T

    -- > You are lucky


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Get user selection (H or T )
        System.out.println("Enter your selection: \n 'H' \n or \n 'T'");
        char userSelection = input.next().toLowerCase().charAt(0);

        // Make a coin toss (3 times)
        // 0 = H , 1 = T
        int t1 = random.nextInt(2); // 0 , 1
        int t2 = random.nextInt(2); // 0 , 1
        int t3 = random.nextInt(2); // 0 , 1

//        System.out.println("H = 0 , T = 1 \n " + t1 + " " + t2 + " " + t3);
        System.out.println(t1==0?"H":"T");
        System.out.println(t2==0?"H":"T");
        System.out.println(t3==0?"H":"T");

        // Calculate the number of heads
        int sum = t1 + t2 + t3;
        int numOfHeads = 3 - sum;
        System.out.println("Number of Heads: " + numOfHeads);
        // Check if the user is lucky
        if(userSelection == 'h'){
            if(numOfHeads>=2)
                System.out.println("You're lucky");
            else
                System.out.println("Try again...");
        }
        else {
            if(numOfHeads>=2)
                System.out.println("Try again...");
            else
                System.out.println("You're lucky");
        }

    }
}
