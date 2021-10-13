package lesson13.Demo;

import lesson11.MultiDimensionalArrayDemo;

public class Demo {

    public static void main(String[] args) {

        int [] nums = {2,4,5,8,5,4,3,5,6,8,8,6,5,4,43,3,5,65,6,5,1,9,3,4,8,5,7,3,5,2,8,5,3,7};
        int [] segments = {10,10,12,2};

        int [][] result = splitToSubArrays(segments, nums);
        MultiDimensionalArrayDemo.printTable(result);
    }

    public static int[][] splitToSubArrays(int [] segments, int [] nums){
        int [][] months = new int[segments.length][];
        int index = 0;
        for (int i = 0; i < segments.length; i++) {
            months[i] = new int[segments[i]];

            for (int j = 0; j < segments[i]; j++) {
                months[i][j] = nums[index];
                index++;
            }

        }
        return months;
    }
}
