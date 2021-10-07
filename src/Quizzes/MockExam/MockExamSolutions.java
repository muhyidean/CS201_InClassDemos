package Quizzes.MockExam;


import java.util.Random;

public class MockExamSolutions {


	public static void main(String[] args) {



		rollDice(3);
//		numberFormat(6411111211L);
		
		int x = 5; 
		
		Course pp = new Course("PP","CS201",4);
		Student std1 = new Student("Eggie", 111, 3.8 , pp);
		Student std2 = new Student("Roda", 112, 3.7 , pp);

		System.out.println(std2);
	}
	
	/*
	Write a function/method called rollDice() that will 
	take a number and roll a dice the number of 
	times based on the entered parameter and output 
	all results. The range of a dice is
	(1-6).
	*/
	
	public static void rollDice(int number) 
	{ 
		Random rand = new Random();
		for(int i =0 ; i<number ; i++) {
			int r = rand.nextInt(6-1+1)+1;      // (max - min + 1) + min --> 1-6
			System.out.println(r);
		}
	}
	
	/*
	Write a method called numberFormat() that will 
	take a phone number, which must be a number.
	The method verifies IF the number is equal to 
	10 digits. If true, it should print it out in 
	the following form ---> xxx-xxx-xxxx. If false, 
	it should print out an error message.
	*/
	
	public static  void  numberFormat(Long phone) {
		//String n = phone +"";
		//String stringPhone = phone.toString();
		String stringPhone = String.valueOf(phone);  // make it a string
		
		// 6412224444 -->  641-222-4444
		if(stringPhone.length() == 10) // checking if equal to 10
			System.out.println(stringPhone.substring(0,3) + "-" + stringPhone.substring(3,6) + "-" + stringPhone.substring(6));
		else
			System.out.println("This is an invalid number!");
	}
}

/*
Create two classes Student and Course as required below.
–Course has three fields(data members): courseId (String), 
courseName (String), creditHours (int)

–Student has four fields: stdName (String), stdId (int), 
gpa (double), course (Course).
–Place constructors in each class.
–Place appropriate getters and setters in each class.
–Write a main method which creates one instance of each 
class and output some information to the console.
*/

