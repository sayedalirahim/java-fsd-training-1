
/*
 * 16)Write a java program to take input of integer array elements from the user 
 * and divide each element by the smallest element of the array and store the result in a resultant array.
 *  Implement Try- catch-finally block to counter null pointer divide by zero error.
 */


import java.util.Arrays;
import java.util.Scanner;

public class programm16 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the array size");
			int size = sc.nextInt();
			int[] arr1 = new int[size];
			int[] arrcpy = new int[size];
			int[] res = new int[size];
			System.out.println("Enter the elements for array : ");
			for(int i=0;i<size;i++)
			{
				arr1[i] = sc.nextInt();
			}
			for(int i=0;i<size;i++) //copying the array elements:
			{
				arrcpy[i] = arr1[i];
			}
			
			
			int temp;
					for(int i=0;i<size;i++)
					{
						for(int j=i+1;j<size;j++)
						{
							if(arr1[i]>arr1[j])
							{
								temp = arr1[i];
								arr1[i] = arr1[j];
								arr1[j] = temp;
							}			
						}
					}
					int small = arr1[0];
					System.out.println(small);
					
					for(int k=0;k<size;k++)
					{
						res[k] = arrcpy[k]/small;
					}
					System.out.println("Resultant array: ");
					System.out.println(Arrays.toString(res));
					sc.close();
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception Caught");
		}
		catch(ArithmeticException c)
		{
			System.out.println("Divide by zero - Arithmetic exception");
		}
		finally
		{
			System.out.println("Finally block is executed");
			
		}
		

	}

}