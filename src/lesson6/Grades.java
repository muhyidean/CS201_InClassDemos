package lesson6;

public class Grades {

	public static void main(String[] args) {
		
		int score = 91;
		
		if (score>=90)
			System.out.println("Your grade is A");
		else if (score >= 80)
			 System.out.println("Your grade is B");
		else if (score >= 70)
			 System.out.println("Your grade is C");
		else if (score >= 60)
			 System.out.println("Your grade is D");
		else
			 System.out.print("Your grade is F");

		System.out.println("continue...");
	}

}
