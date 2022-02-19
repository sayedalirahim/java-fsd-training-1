import java.util.Scanner;

public class CharTwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the row and column");
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		char[][]  arr1 = new char[a][b];
		
		System.out.println("enter the elements");
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr1[i][j] = sc.next().charAt(0);
			}
		}
		
		System.out.println(" the elements are");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(arr1[i][j] +" , ");
			}
			System.out.print(" ");
		}

	}

}
