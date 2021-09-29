package Quizzes;

import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first and last name: ");
        String firstName = input.next();
        String lastName = input.next();

        String email = firstName.toLowerCase().charAt(0) + lastName.toLowerCase() + "@miu.edu";

        System.out.println(email);

    }
}
