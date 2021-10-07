package Quizzes;

import java.util.Random;

public class Sample {

    public static void main(String[] args) {
        printName();
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
}
