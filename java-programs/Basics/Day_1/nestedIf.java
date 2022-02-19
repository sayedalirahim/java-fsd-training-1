import java.util.Scanner;
public class nestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		if( num < 100 )
		{
			System.out.println("the entered number is less than 100");
			if(num > 50 )
			{
				System.out.println("the entered number is less than 50");
			}
		}
			else
			{
				System.out.println("the entered number is greater than 100");
			}
		}
	}


