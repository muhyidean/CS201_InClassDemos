package lesson7;

import java.util.Random;

public class NestedLoops {

	public static void main(String[] args) {
		randomBoard();
	}
	
	public static void randomBoard() 
	{
		Random rand =  new Random();
		
		for(int r =0; r< 3 ; r++) 
		{
			for (int c = 0 ; c< 3 ; c++) 
			{
				System.out.print(rand.nextInt(9)+1 + " ");
			}
			System.out.println("");
		}
	}

	
	public static void printTable()
	{
		for(int r =0; r< 4 ; r++) 
		{
			for (int c = 0 ; c< 5 ; c++) 
			{
				System.out.print("( " +  r + ", " + c + " ) ");
			}
			System.out.println("");
		}
	}
}
