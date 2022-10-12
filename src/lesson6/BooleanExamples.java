package lesson6;

public class BooleanExamples {

    public static void main(String[] args) {

        int num = 7;

        int x =5 ;
        int y = 10;
        int z = 0;

        boolean isInRange = num>x && num<y;

        if ( isInRange ) { //
            System.out.println("within range");
        } else {
            System.out.println("not in range");
        }


        System.out.println("------");


        if(z == 0 || x / z > 20){
            System.out.println("Good");
        }

//        System.out.println(isInRange?"within range": "not in range");

    }
}
