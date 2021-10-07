package Quizzes;

public class Quiz5 {

    public static void main(String[] args) {
        printTable();
    }

    /**
     * Write a method called printNextTen() that will take a number and print it with the ten subsequent numbers
     *
     *
     *
     * Example >>> printNextTen( 5 )
     *
     * Output -->
     * 5 6 7 8 9 10 11 12 13 14 15
     */
    public static void printNextTen(int num){

        for(int i =num;i<=num+10;i++){
            System.out.print(i + " ");
        }
    }

    public static void printTable(){
        for(int i= 0; i<= 3 ; i++){
            for(int j= 0 ;j<=3;j++){
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println("");
        }
    }
}
