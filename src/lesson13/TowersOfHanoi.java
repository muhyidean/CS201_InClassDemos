package lesson13;

public class TowersOfHanoi {
    public static void main(String[] args) {
        towersOfHanoi(6,1,2,3);
    }

    public static void towersOfHanoi(int N,      //number of disks
                                     int from,  //origin peg
                                     int to,    //destination peg
                                     int spare ){//"middle" peg

        if ( N == 1 ) {

            moveOne( from, to );

        } else {
            towersOfHanoi( N-1, from, spare, to );
            moveOne( from, to );
            towersOfHanoi( N-1, spare, to, from );
        }
    }

    private static void moveOne( int from, int to ) {
        System.out.println( from + " ---> " + to );
    }



}
