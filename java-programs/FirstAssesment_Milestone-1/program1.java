

//  Write a Java Program to reverse a string without using String inbuilt function reverse ().

import java.util.Scanner;
public class program1 {

	public static void main(String[] args) {
		String str;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the string you want to reverse!!= ");  
		str=sc.nextLine();                   
		System.out.print("reverse string is: ");  
	
		for(int i=str.length(); i>0 ;--i)                 
		{  
		System.out.print(str.charAt(i-1));              
		}  
	}

	}


