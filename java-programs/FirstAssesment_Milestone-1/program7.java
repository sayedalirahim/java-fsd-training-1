/*
 * 7)Write a java program to take a string input from the user. Convert all the uppercase letters to lowercase and vice-versa.
Example:
Input:
MIcroSoft
Output:
miCROsOFT

 */

import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str2 = sc.next();
		
		char ch;
		
//		upper to lowercase
		
		for(int i=0;i<str2.length();i++)
		{
			ch = str2.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.print(Character.toLowerCase(ch));
			}
			else {
				System.out.print(Character.toUpperCase(ch));
			}
		}
		
		sc.close();		

	}

}
