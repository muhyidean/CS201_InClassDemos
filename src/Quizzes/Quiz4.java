package Quizzes;

public class Quiz4 {

    public static void main(String[] args) {

    }

    public static void printPriceCategory(int sal){
        if(sal> 220000)
            System.out.println("High");
        else if(sal > 70000)
            System.out.println("Medium");
        else
            System.out.println("Low");
    }


}
