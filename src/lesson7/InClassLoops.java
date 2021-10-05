package lesson7;

import java.util.Scanner;
public class InClassLoops {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a password that has at least 8 characters: ");
			String password = input.nextLine();
			
			if(password.length()>=8) {
				System.out.println("Password saved!");
				break;
			}
			System.out.println("Invalid password");
		}

	}

}
