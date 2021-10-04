package lesson6;

public class Main {

    public final static double LOW_TAX_RATE = 0.1;
    public final static double HIGH_TAX_RATE = 0.18;

    public final static double SINGLE_TAX_THRESHOLD = 40000;
    public final static double MARRIED_TAX_THRESHOLD = 60000;

    public static void main(String[] args) {


        int sal = 50000;
        String status = "single";

        System.out.println(Main.calcTaxRate2(status, sal));

//        int x = 5;
//
//
//        if(x > 4) {
//            System.out.println("It is greater");
//            System.out.println("something else");
//        } else {
//                System.out.println("It is less");
//            }




    }

    public static double calcTaxRate(String status , int salary){
        if (status.equals("single")){
            // single
            if(salary > SINGLE_TAX_THRESHOLD){     // 40000
                return HIGH_TAX_RATE;
            }else
                return LOW_TAX_RATE;
        } else {
            // married
            if(salary > MARRIED_TAX_THRESHOLD){    // 60000
                return HIGH_TAX_RATE;
            }else
                return LOW_TAX_RATE;
        }
    }
    public static double calcTaxRate2(String status , int salary){
        boolean isLowRate = ( (status.equals("single") && salary<=SINGLE_TAX_THRESHOLD) || (status.equals("married") && salary<=MARRIED_TAX_THRESHOLD));
        if (isLowRate)
            return LOW_TAX_RATE;
        else
            return HIGH_TAX_RATE;
    }

}
