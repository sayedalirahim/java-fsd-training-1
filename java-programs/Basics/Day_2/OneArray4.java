import java.util.Scanner;
public class OneArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i,sum=0;
		System.out.println("enter the size of the array");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n];
		
		
		System.out.println("enter the elements of the arrray1");
		
		for(i=0;i<n;i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the elements of the array2");
		
		for(i=0;i<n;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		for(i=0;i<n;i++) {
			arr3[i] = arr1[i] + arr2[i]; 
		}
		
		System.out.println("the sum of elements is :");
		
		for(i=0;i<n;i++)
		{
			System.out.println(arr3[i]+ ",");
		}
		

	}

}
