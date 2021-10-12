package lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		try {
			methodA();

		}catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("This is from Array");
			System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println("This is from a wrong mismatch");
		}catch (Exception e) {
			System.out.println("This is from exception");
		}

		System.out.println("Main method code continued ...");
	}

	public static void methodA() throws Exception{

		methodB();
		// execution ...
	}

	public static void methodB() throws Exception {
		
		Scanner input = new Scanner(System.in);
		String [] names = {"John", "Le", "Gebree"};
		
		System.out.println("Enter number: ");
		int i = input.nextInt();
		
		System.out.println(names[i]); // 46

		System.out.println("The code continued ...");
		
		
		
		
			
		
	}

}
