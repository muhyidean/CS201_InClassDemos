package lesson11;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

       int [] nums = {1,1,2,3,4, 4, 5 , 6 ,6 , 7};


        int [] result = removeDuplicates(nums);
//
        for(Integer i : result ){
            System.out.println(i);
        }
//
//        int minIndex = 0;
//        int maxIndex = 0;

//        int [] nums = {3 ,4 ,5 ,6, 1};

//        for (int e : nums){
//            System.out.println(e);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] < nums[minIndex]){
//                minIndex = i;
//            }
//            else if( nums[i] > nums[maxIndex]){
//                maxIndex = i;
//            }
        }

//        System.out.println("Index of the least value:" + minIndex);


    /*
    Write a method called removeDuplicates() that will take an array and remove all duplicates in it without using the Java Collection API.
    The array can be an array of String, Integer, or Character.
     */

    public static int[] removeDuplicates(int[] arr){
        int [] newArr = new int[arr.length]; // {0,0,0,0,0,0,0,0}
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if( !hasValue(newArr,arr[i])){
                newArr[counter] = arr[i];
                counter++;
            }
        }
        return newArr;
    }

    public static boolean hasValue(int [] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if( value == arr[i] )
                return true;
        }
        return false;
    }

    }



