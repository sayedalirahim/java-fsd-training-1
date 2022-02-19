import java.util.Scanner;

public class OneArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the size of the array");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		char[] arr = new char[size];
		System.out.println("enter the character values");
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.next().charAt(0);
		}
		
		System.out.println("value entered is");
		
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
