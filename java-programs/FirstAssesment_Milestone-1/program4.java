
// 4)Write a Java Program to find the duplicate characters in a string.


import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		char[] ar = st.toCharArray();
		
		System.out.println("The duplicate elements are");
		
		for(int i =0;i<ar.length;i++)
		{
			int count = 0;
			for(int j=i+1;j<ar.length;j++) 
			{
			if(ar[i] == ar[j] && ar[i]!=' ')
			{
				count ++;
				ar[j] = '0';
			}
		}	
		if(count>0 && ar[i]!='0')
		{
			System.out.println(ar[i] + " ,");
		}
	}
	sc.close();
	}
	}


