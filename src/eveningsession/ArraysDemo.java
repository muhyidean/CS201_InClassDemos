package eveningsession;

public class ArraysDemo {

    public static void main(String[] args) {

        String [][] mda = { {"zaina", "yasmeen","mira"} , {"tengis" ,"zelalem", "addisu"} , {"mira","john","dale"} };
        int [][] numsMda = {{1,2,3}, {4,5,6}, {7,8,9,8,7,6,5,4,3,2} }; // {2 , 5 , 8 }


//        printRowContainingName(mda,"mira");

        double [] answer = calcAvgRows(numsMda);

        for (double avg: answer){
            System.out.println(avg);
        }
    }


    public static String [][] groupArrays (String [] arr1, String [] arr2, String arr3 []){
        String [][] result = { arr1, arr2, arr3};
        return result;
    }

    public static void printRowContainingName( String [][] mda, String name){

        for (int r = 0; r < mda.length; r++) {

            // Inner array
            for (int c = 0; c < mda[r].length; c++) {
                if(mda[r][c].equalsIgnoreCase("mira"))
                    System.out.println("Row: " + r);
            }

        }

    }

    public static double [] calcAvgRows( int [][] arr){ // {  {1,2,3}, {4,5,6}, {7,8,9,7} }
        double [] result = new double[ arr.length ]; // { 2 ,0 ,0}
        double sum = 0; // 6
        int indexCounter = 0;

        for (int r = 0; r < arr.length; r++) {

            for (int c = 0; c < arr[r].length; c++) {
                sum+= arr[r][c]; // 00  01  02
            }
            result[indexCounter] = sum / arr[r].length;
            indexCounter++;
            sum = 0;

        }

        return result;
    }




}
