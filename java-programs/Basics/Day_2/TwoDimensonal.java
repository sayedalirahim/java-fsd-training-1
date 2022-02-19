import java.util.*;
public class TwoDimensonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.println("enter the value of row and column");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		int[][] arr3 = new int[row][col];
		
		System.out.println("enter the value of 1st array");
		
		for( i=0;i<row;i++)
		{
			for( j=0;i<col;j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		

		System.out.println("enter the value of 2st array");
		
		for( i=0;i<row;i++)
		{
			for( j=0;i<col;j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}
		
		for( i=0;i<row;i++)
		{
			for( j=0;i<col;j++)
			{
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("the sum is:");
	    for(i=0;i<row;i++)
	    {
	      for(j=0;j<col;j++)
	      {
	        System.out.print(arr3[i][j]+" ");
	      }
	      System.out.println("");
	    }

		
	
	}

}
