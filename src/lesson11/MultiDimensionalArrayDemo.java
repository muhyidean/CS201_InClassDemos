package lesson11;

public class MultiDimensionalArrayDemo {

    public static void main(String[] args) {

        int [] nums = {1 ,2 ,3 };

        int [][] numsTable = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };



        System.out.println(nums[2]);

        System.out.println(numsTable[0][2]);


        printTable(numsTable);


    }

    public static void printRow(int [][] multiArray, int row){

        for (int i = 0; i < multiArray[row].length; i++) {
            System.out.print(multiArray[row][i] + " ");
        }
    }

    public static void printTable(int [][] multiArray){

        for (int r = 0; r < multiArray.length; r++) {

            for (int c = 0; c < multiArray[r].length; c++) {
                System.out.print(multiArray[r][c] + "\t");
            }
            System.out.println("");
        }
    }
}
