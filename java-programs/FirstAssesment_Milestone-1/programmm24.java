
// 24)Do the addition of around 10 even numbers, but use the continue statement in the logic

public class programmm24 {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("first 10 even numbers: ");
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				continue;
			}
			System.out.print(i+" ");
			sum = sum+i;
		}
		System.out.println();
		System.out.println("The sum of first 10 even numbers: "+sum);
		

	}

}
