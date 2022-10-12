package lesson6;

import lesson5.Student;

public class InClassDemol6 {

    public static void main(String[] args) {

        int n = 0;
        if( n ==0 || 20 / n > 5){
            System.out.println("...");
        }


        Student std = new Student();


        if( std.isActive() ){
            System.out.println("You are active");
        }

        boolean b = true;
        int x = 15;

        if( x > 10 ) {
            System.out.println("x is greater than 10");

            if (x < 20)
                System.out.println("x is between 10 and 20");
        }else {
            System.out.println("x is less than 20");
        }




    }
}
