
// 5)Write a Java Program to find the second-highest number in an array.


import java.util.Scanner;

public class program5 {
	
	public static int getSecond(int[] a, int n)
	{
	
	int temp;
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	
	return a[n-2];
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int len  =sc.nextInt();
		int[] arr1 = new int[len];
		System.out.println("Enter the array elements");
		for(int i =0;i<len;i++)
		{
			arr1[i] = sc.nextInt();
		}
	
		System.out.println("the second largest element in array is " +getSecond(arr1,len));
		

	}

}