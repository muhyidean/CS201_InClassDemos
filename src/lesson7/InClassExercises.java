package lesson7;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class InClassExercises {

    public static void main(String[] args) {

//        System.out.println(countVowels("I love MIU"));
//        System.out.println(countWords("I am very happy"));

            nestedLoopExercise();

//        InClassExercises.coinToss();
//        InClassExercises.calcLuck();
//        InClassExercises.printStarsStudents(5);

    }


    /**
     Write a method that will take a sentence and print the number of vowels it contains.
     */
    public static int countVowels(String sentence){
        int counter = 0;
        String s = sentence.toLowerCase();

        for(int i=0; i<sentence.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'u' || s.charAt(i) == 'o' || s.charAt(i) == 'i' ){
                counter++;
            }
        }
        return counter;
    }

    /**
     Write a method that take will take a sentence and count the number of words.
     */
    public static int countWords(String sentence){
        int counter = 1;

        if (sentence.trim().length() == 0){
            counter = 0;
            return counter;
        }

        for(int i=0; i<sentence.length();i++){
            if(sentence.charAt(i) == ' '){
                counter++;
            }
        }
        return counter;
    }

    public static void coinToss(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of tosses");
        int tosses = input.nextInt();

        for(int i = 0 ; i<tosses; i++){
            int toss = random.nextInt(2);

            if(toss == 0)
                System.out.println("H");
            else
                System.out.println("T");
        }
    }

    public static void calcLuck(){
        // H = 0 , T = 1
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int counter = 0;
        System.out.println("Enter the number of tosses");
        int tosses = input.nextInt();

        System.out.println("Select one of the following options:\n1-H\n2-T ");
        String face = input.next();

        for(int i = 0 ; i<tosses; i++){
            int toss = random.nextInt(2);
            if(toss == 0)
                System.out.println("H");
            else
                System.out.println("T");

            counter += toss;
        }

        double percentage = counter / (double)tosses; // the percentage of tails

        if (face.equals("H"))
            percentage = 1 - percentage;

        if(percentage>0.5)
            System.out.println("You're lucky!");
        else if(percentage == 0.5)
            System.out.println("50/50");
        else
            System.out.println("Go home!");

    }

    public static void printStars(int num){
        String stars = "";
        for(int i =0; i< num ; i++){
            stars = stars + "*";
            System.out.println(stars);
        }

    }

    public static void printStarsStudents(int num){
        for(int i =1; i<= num ; i++){
            for(int j =0; j< i ; j++){
                System.out.print("*");
            }
            System.out.println("");

        }

    }

    /**
     * 10, 11 --- 19
     * 20, 21 --- 29
     * 30, 31 --- 39
     * 40, 41 --- 49
     */
    public static void nestedLoopExercise(){
        int num = 10;
        for(int r =0 ; r<4 ; r++){
            for (int c = 0 ; c<10 ; c++){
                System.out.print(num + " ");    // inner loop
                num++;                          // inner loop
            }
            System.out.println("");         // outer loop
        }


    }





}
