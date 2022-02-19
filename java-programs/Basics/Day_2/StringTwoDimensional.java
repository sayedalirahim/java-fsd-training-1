import java.util.Scanner;

public class StringTwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("enter the row and column");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		String[][] arr1 = new String[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j] = sc.next();
			}
				
			}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr1[i][j] +" , ");
			}
			System.out.println(" ");
			}
			

		

	}

	}
