package lesson7;

import java.util.Random;

public class LoopDemo {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int [] arr = new int [9];
		int index = 0;
		for (int r=0; r<3 ; r++) 
		{		
			for(int j = 0 ; j< 3 ; j++) 
			{
				insertNumber(arr, index);
				System.out.print(arr[index] + " ");
				index++;
			}
			System.out.println("");
		}

	}
	
	public static void insertNumber( int [] arrP, int index){
		Random rand = new Random();
		
		while(true) {
			int randomNumber = rand.nextInt(9)+1;
			boolean hasNumber = arrContains(arrP, randomNumber);
			
			if(hasNumber)
				continue;
			else {
				arrP[index] = randomNumber;
				break;
			}			
		}
	}
	/**
	 * This guy will check if it contains the number
	 * 
	 * @param arr
	 * @param number
	 * @return
	 */
	public static boolean arrContains(int [] arr, int number) {	
		for(int i = 0; i< arr.length;i++) {
			if(arr[i] == number)
				return true;
		}
		return false;
	}
	
	

}
