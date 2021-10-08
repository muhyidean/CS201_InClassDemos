package Quizzes;

import java.util.Random;
import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {
        // printName();
        RPS();
    }

    public static int sum(int a , int b){
        return a+b;
    }

    public static int countA(String word){
        int counter = 0;

        for(int i=0; i<word.length();i++){

            if(word.charAt(i)=='a')
                counter++;
        }

        return counter;
    }

    public static int countChar(char c, String word){
        int counter = 0;
        for(int i=0; i<word.length();i++){

            if(word.charAt(i)==c)
                counter++;
        }
        return counter;
    }

    // Dean, Zaineh, Yasmeen

    public static void printName(){

        Random random = new Random();

        int r = random.nextInt(3);

        if(r == 0 )
            System.out.println("Dean");
        else if(r == 1)
            System.out.println("Zaineh");
        else
            System.out.println("Yasmeen");
    }

    public static void RPS(){

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        while(true){
            int rand = random.nextInt(3);  // 50 - 54

            if(rand == 0 )
                System.out.println("Rock");
            else if(rand == 1)
                System.out.println("Paper");
            else
                System.out.println("Scissors");

            System.out.println("Write stop to quit");
            String answer = input.next();
            if (answer.equalsIgnoreCase("quit"))
                break;
        }




    }

}
