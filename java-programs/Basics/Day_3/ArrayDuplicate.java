import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int[] ar1 = new int[len];
		System.out.println("Enter the elements for array: "); 
		for(int i=0;i<len;i++)
		{
			ar1[i] = sc.nextInt();
		}
		System.out.println("");
		System.out.println("Duplicated elements are: "); 
		for(int i=0;i<len;i++) 
		{
			for(int j=i+1;j<len;j++)
			{
				if(ar1[i] == ar1[j])
				{
					System.out.println(ar1[j]);
				}
			}
			
		}

	}

}
