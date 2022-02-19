import java.util.*;
public class OneArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[10];
		System.out.println("Enter 10 integer values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
			System.out.print(arr[i]);
		}
		
//		System.out.println("The array elements entered are:");
//		
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(arr[i] + " , ");
//		}
//		
		

	}

}
