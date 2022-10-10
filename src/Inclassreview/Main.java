package Inclassreview;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(Main.randomRange(1,6));
        printFirstLast("Dean");
        getFirstWord("He went to the school");
        String text = "He went to the school";
        System.out.println(text.indexOf(" " , 3));


    }

    /*
    Write a method called randomRange() that will take a range (min, max)
     to produce a random number. It should return a random integer.
     */

    public static int randomRange( int min, int max){
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }

    /*
    Write a method called printFirstLast() that will take in a word
    and print the first and last characters.
     */

    public static void printFirstLast(String word){
        System.out.println(word.charAt(0) + " " + word.charAt(word.length()-1));
    }

    /*

    Write a method called getFirstWord() that will take a string and print out the first word.

     */
    public static void getFirstWord(String sentence){
        int index = sentence.indexOf(" ");
        String firstWord = sentence.substring(0,index);
        System.out.println(firstWord);
    }
}
