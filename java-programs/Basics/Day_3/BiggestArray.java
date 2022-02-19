import java.util.Scanner;

public class BiggestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int[] ar1 = new int[len];
		System.out.println("Enter the elements for array: "); 
		for(int i=0;i<len;i++)
		{
			ar1[i] = sc.nextInt();
		}
	max = ar1[0]; 
	
	for(int i=0;i<len;i++) {
		if(max < ar1[i]) {
			max = ar1[i];
		}
	}
	
	System.out.println("");
	System.out.println("Maximum value in the array is: "+max);
}

}

