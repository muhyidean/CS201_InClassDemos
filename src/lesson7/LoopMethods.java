package lesson7;

public class LoopMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void printString( String s) {
		
		for(int i =0; i<s.length();i++) {
			System.out.println(s.charAt(i));  
		}
	}
	
	public static void executeNumTimes(int n) {
		
		for (int i = 0 ; i<n ; i++) {
			System.out.println("Some execution");
		}
	}
	
	public static void printArray(int [] arr) {
		
		for (int i = 0; i<arr.length ; i++) {
			System.out.println(arr[i]);  // arr[0]  arr[1] ... arr[n]
		}
	}
	
	

}
