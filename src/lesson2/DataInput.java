package lesson2;

import java.util.Scanner;

public class DataInput {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter first and last name please: ");  // Dean Altarawneh
        String fName = input.next(); // Dean
        String lName = input.next(); // Altarawneh


        System.out.println(fName.substring(0,1) + lName.substring(0,1));
    }
}
