package Quizzes;

import lesson11.MultiDimensionalArrayDemo;

public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {

        int [][] mArr = {
                {1,2,3},
                {4,5,6,5,5},
                {7,8,9,1}
        };

        int [] result = rowSum(mArr);

        for (int i : result){
            System.out.println(i);
        }

    }

    /**
     *
     * Write a method that will calculate the sum of each row in a 2D array and return an array with the sums of each row.
     *
     * rowSum( array )
     *
     * = [ 15, 12, 16, 10]   based on the # of rows
     *
     * [1,2,3,4]    // arr[0]
     * [4,5,6]      // arr[1]
     * [2,6,8,9]    // arr[2]
     */
    public static int [] rowSum (int [][] arr){
        int sum;
        int [] sumRows = new int[arr.length];

        for (int r = 0; r < arr.length; r++) {
            sum = 0;
            for (int c = 0; c < arr[r].length; c++) {
                sum +=arr[r][c];
            }
            sumRows[r] = sum;
        }
        return sumRows;



    }
}
