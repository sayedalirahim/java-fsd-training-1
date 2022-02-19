

// 26)Write programs to depict the usage of contains (), length (), replace (), concat (), equals ()

import java.util.Scanner;

public class programmm26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st1 = sc.nextLine();
		System.out.println("Enter another string");
		String st2 = sc.nextLine();
		
		System.out.println("Checking string 2 contains in string 1:   "+st1.contains(st2));
		System.out.println("The length of String1:   "+st1.length());
		System.out.println("Checking two strings are equal:   "+st1.equals(st2));
		System.out.println("Concatenating two string:   "+st1.concat(st2));
	
       System.out.println("Using replace method:   "+st1.replace('e', 'a'));
		sc.close();

	}

}
