package lesson2;

import java.util.Scanner;

public class DataInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name please: ");

        String fName = input.next();
        String lName = input.next();

        char c = fName.charAt(0);
        System.out.println(c);

        System.out.println(fName.charAt(0) + "" + lName.charAt(0));
    }
}
