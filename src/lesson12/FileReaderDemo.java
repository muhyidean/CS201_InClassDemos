package lesson12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		try {
			readFile();
		} catch (FileNotFoundException e){
			System.out.println("This file does not exist");
		}catch (Exception e) {
			System.out.println("Something happened!");
			e.printStackTrace();
		}
	}
	public static void readFile()  throws Exception{
		FileInputStream fstream = new FileInputStream("/Users/muhyieddin/MIU/CS201/CS201 Material/Demos/CS201_InClassDemos/src/lesson12/test.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)   {
		  // Print the content on the console
		  System.out.println (strLine);
		}

		//Close the input stream
		fstream.close();
	}

}
