package lesson3;




public class NumericDemo {

    final static double PASSING_GRADE = 70.0;

    public static void main(String[] args) {


        int x = (int) 5.8;
        System.out.println(x);

        double d = 5 + 3;
        System.out.println(d);

        double grade = 66.6;

        if(grade >= PASSING_GRADE) {
            System.out.println("Passed");
        }
        else{
            System.out.println("Not passed");
        }

        double y = 0;
        y = y + PASSING_GRADE;



    }
}
