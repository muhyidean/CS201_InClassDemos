package lesson2;


import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first and last name:");
        String fName = input.next();
        String lName = input.next();

        System.out.println("" + fName.charAt(0) + lName.charAt(0));



    }

}
