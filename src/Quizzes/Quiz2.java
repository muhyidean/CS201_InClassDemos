package Quizzes;


import java.util.Random;

/**
 * Quiz#2
 *
 Write a method that will generate 10 random grades.
 The grades to output should be one of the following ("A" , "B", "C" , "D");
 *
 */
public class Quiz2 {

    Random random = new Random();


    public void solutionA(){
        for(int i =0 ; i<10 ; i++){
            int randonNumber = random.nextInt(4);

            if (randonNumber == 0)
                System.out.println("A");
            else if (randonNumber == 1)
                System.out.println("B");
            else if (randonNumber == 2)
                System.out.println("C");
            else
                System.out.println("D");
        }
    }

    public void solutionB() {
        for (int i = 0; i <= 10; i++) {
            char randomGrade = (char) (random.nextInt(4) + 'A');
            System.out.print(randomGrade + " ");
        }
    }

    public void solutionC() {
        String str = "ABCD"; // This could also be an array
        for (int i = 0; i < 10; i++){
            int index = random.nextInt(4);
            System.out.println(str.charAt(index));
        }
    }



    public static void main(String[] args) {
        Quiz2 quiz2 = new Quiz2();

        quiz2.solutionA();
        //quiz2.solutionB();
        //quiz2.solutionC();
    }
}
