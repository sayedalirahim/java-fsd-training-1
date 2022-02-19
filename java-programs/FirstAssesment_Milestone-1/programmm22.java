
// 22)Take the number input from the console and add all the positive numbers.
//(Not to consider the negative number if entered)



import java.util.Scanner;
public class programmm22 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		System.out.println("Enter the numbers : ");
		for(int i=0;i<len;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<len;i++)
		{
			if(arr[i]<0)
			{
				continue;
			}
			sum = sum+arr[i];
		}
		System.out.println("The sum of all positive numbers is: "+sum);
		sc.close();

	}

}