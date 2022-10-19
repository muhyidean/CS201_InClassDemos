package lesson12;

import java.nio.file.FileAlreadyExistsException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter number: ");
            int i = input.nextInt();

        }
        catch (NullPointerException e){
            System.out.println("Invalid, there is no value");
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }

        System.out.println("The code continued to execute");


    }

    // make method that will find a value in an array and the user can insert the index
    // if the index doesn't match it will throw an exception
}
