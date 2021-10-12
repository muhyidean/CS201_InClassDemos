package lesson12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileDemo {

	/**
	 * Just an example of handling without throwing and exception
	 *
	 */
	public static void main(String [] args)  {
		
		// Open the file
		FileInputStream fstream = null;
		try {
			fstream = new FileInputStream("[YOUR PATH HERE]/test.txt");
		} catch (FileNotFoundException e1) {
			System.out.println("Now we know the error is and manage our application");
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		try {
			while ((strLine = br.readLine()) != null)   {
			  // Print the content on the console
			  System.out.println (strLine);
			}
		} catch (IOException e) {
			System.out.println("Now we know the error is and manage our application");
			e.printStackTrace();
		}

		//Close the input stream
		try {
			fstream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
