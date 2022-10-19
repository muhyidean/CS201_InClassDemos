package lesson12;

import java.util.InputMismatchException;

public class Test {

    public static void main(String[] args) {

        try{
            double d = 5/2;
        }
        catch (Exception e){
            System.out.println("Something went wrong...");
            e.printStackTrace();
            // sendTicket()
        }


        System.out.println("program continued...");
    }
}
