package lesson8;

import lesson5.Student;

public class Main {

    public static void main(String[] args) {

        Student s = new Student();

        char ch = 'a';
        System.out.println( ch );

        int x = 5;

//        String s = String.valueOf(x);

        String name = " Dean     ";
        String updatedName = name.trim().toLowerCase();
        int updatedLength = name.trim().length();


        System.out.println( name.trim().toLowerCase() );



    }
}
