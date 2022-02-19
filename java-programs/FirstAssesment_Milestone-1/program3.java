
/*
 * Write a Java Program to find whether a string or number is palindrome or not. 
//Note: input can be a number or a String.
 */

import java.util.Scanner;

public class program3 {
	
	static boolean Palin(String str) {
		
		int x=0,y=str.length()-1; 
		while(x<y)
		{
			if(str.charAt(x)!=str.charAt(y))
			{
				return false;
			}
			x++;
			y--;
		}
		
		return true;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		if(Palin(str))
		{
			System.out.println("Is a palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		
		}	
	
	}

}


