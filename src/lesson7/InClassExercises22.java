package lesson7;

import java.util.Random;

public class InClassExercises22 {

    public static void main(String[] args) {

        String text = "I love MIU";
        System.out.println("=========");
        System.out.println( countVowels(text));
        System.out.println(countWords(text));
        System.out.println("=========");
//        coinToss(5);
        coinTossLuck(1,4);


    }

    /*
    Write a method that will take a sentence and print the number of vowels it contains.
     */
    public static int countVowels( String text){
        int numVowels = 0;

        for (int i = 0; i < text.length(); i++) { // "I love MIU"
            char c = text.toLowerCase().charAt(i);
            if(c =='a' || c =='e' ||  c =='i' ||  c =='o' ||  c =='u' )
                numVowels++;
        }

        return numVowels;
    }

    /*
    Write a method that take will take a sentence and count the number of words.
     */
    public static int countWords(String sentence){ // "I love MIU"
        int wordCount = 1;

        if(sentence.trim().length() == 0){ // ""
            wordCount = 0;
            return wordCount;
        }

        for (int i = 0; i < sentence.length() ; i++) {
            if(sentence.charAt(i) == ' ')
                wordCount++;
        }

        return wordCount;
    }

    /*
    Write a method that will ask the user to insert a number n and toss a coin n times.
    It should print out H or T
     */

    public static void coinToss( int n){
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int r = random.nextInt(2); // 0 ,1
            System.out.println( r==0?"H":"T" );
        }

    }

    /*

    After solving Q.3, make it calculate the percentage of matches and print “You’re lucky!”
    \if greater than 50, “50/50” 		if equal to 50, “Go home!” 	if less than 50.
     */


    public static void coinTossLuck( int selection, int n){
        // Heads = 0, Tails = 1;

        int tails = 0;
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int r = random.nextInt(2); // 0 ,1
            System.out.println( r==0?"H":"T" );
            tails+=r;
        }

        if(selection == 0){
            // heads

        }
        else{
            //tails
            if(tails > (n/2))
                System.out.println("You're Lucky");//    H T T T H  -     3 > 2
            else if (tails == (n/2) && n%2 ==0 ) // H T T H - t =2 // 2 == 4/2 &&
                System.out.println("50/50");
            else
                System.out.println("Try again...");
        }

    }
}
