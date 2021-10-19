package lesson11;

import Quizzes.MockExam.Course;
import Quizzes.MockExam.Student;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInClassDemo {

    public static void main(String[] args) {

        Student [] cs201Students = ArrayInClassDemo.enterClass(4);



//        for (Student s:cs201Students){
//            System.out.println(s.getStdName() + " " + s.getStdId());
//        }


//        int [] arr = {3 ,4 ,5};
//
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(arr[i]); // 0, 1 ,2
////        }
//
//        printArr(arr);
//        printArr(arr);

    }

    public static void printArr(int [] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
            array[i] = 0;
        }
        System.out.println("]");

    }

    public static Student [] enterClass(int classSize){

        Scanner input = new Scanner(System.in);

        Course cs201 = new Course("PP" , "CS201" , 4);
        Student [] cs201Class = new Student[classSize];

        for (int i = 0; i < classSize; i++) {
            System.out.println("Enter student (" + (i+1) + ") name:");
            String name = input.next();
            System.out.println("Enter student (" + (i+1) + ") id:");
            int sid = input.nextInt();

            cs201Class[i] = new Student(name, sid, 0.0, cs201);

        }

        return cs201Class;

    }

    public static String [] getFirstLetter(String [] names){
        String [] initialOfNames = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            initialOfNames[i] = String.valueOf(names[i].charAt(0));
//            initialOfNames[i] = names[i].substring(0,1);
        }
        return initialOfNames;
    }



}
