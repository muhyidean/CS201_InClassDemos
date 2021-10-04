package Quizzes;

import java.util.Random;

/**
 * Quiz#3
 *
 Write a method called genPass() that will generate and print a password with at least 4 characters. The password should contain the following:
 - An upper case character --> ( 65-90 )
 - A lower case character --> ( 97-122 )
 - A number --> ( 0-9 )
 - A special character --> ( 33-38 )
 *
 */
public class Quiz3 {

    public static void main(String[] args) {
        Quiz3.genPass();
    }

    public static void genPass() {

        Random random = new Random();

        // (max - min + 1) + min

        char c1 =  (char) (random.nextInt(26) + 65);  // 65 - 90
        char c2 =  (char) (random.nextInt(26) + 97); // 97 - 122
        int  c3 =  (char) random.nextInt(10);  // 0 - 9
        char c4 =  (char) (random.nextInt(6) + 33);   // 33-38
        System.out.print(c1 + "" + c2 + "" + c3 + "" + c4);
    }
}
