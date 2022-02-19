

// 18)Write a java program to create a File at a particular location 
//and to write to that particular file a String data which is taken as input from the user

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class programm18 {

	public static void main(String[] args) {
		try {
			File f1 = new File("D:OutputFile.txt");
			FileWriter obj1 = new FileWriter(f1);
			obj1.write("Hello world, I am back !!!!");
			
			obj1.close();
		}
		catch(IOException e)
		{
			System.out.println("there is some issues");
			System.out.println(e);
		}
		System.out.println("file write done successful");

	}

}
