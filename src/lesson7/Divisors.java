package lesson7;

public class Divisors {

	public void printAllDivisors(int number){
		for(int i = 1; i <= number; i++){
			if(number % i == 0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Divisors d = new Divisors();
		d.printAllDivisors(40);
	}
}
