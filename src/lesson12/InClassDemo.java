package lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InClassDemo {

    public static void main(String[] args) {

        String [] names = {"Charles", "Taye" , "Danial"};
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter student id: ");
            int index = input.nextInt();
            System.out.println(names[index]);
        }catch(Exception e) {
            System.out.println("something bad happened: ");
            e.printStackTrace();
            System.out.println("==== e message ====");
            System.out.println(e.getMessage());
//             go back to main
        }


        System.out.println("***** More code ... *****");
    }
}
