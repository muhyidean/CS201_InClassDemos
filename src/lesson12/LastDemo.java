package lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LastDemo {

    public static void main(String[] args) {

        doWeirdStuff();

//            FileReaderDemo.readFile();

//        try {
//            doWeirdStuff();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            methodA();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }

    public static void methodA()throws Exception{
        methodB();
    }
    public static void methodB() throws Exception{
        methodC();
    }
    public static void methodC() throws Exception {
        throw new Exception();

    }



    public static void doWeirdStuff() {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer:");

        try{
            number = scanner.nextInt();
            double a = 100/number;


       }

        catch (ArithmeticException e){
            System.out.println("THIS ONE");
            System.out.println("Enter integer:");

        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");

            e.printStackTrace();
        }

        catch (Exception e){
            System.out.println("We don't know what happened, but look at the stack");
            e.printStackTrace();
        }
        finally{
            System.out.println("Closed streams...");
        }



//        System.out.println("Number is: " + number);

        System.out.println("PROGRAM CONTINUED ... ");


    }
}
