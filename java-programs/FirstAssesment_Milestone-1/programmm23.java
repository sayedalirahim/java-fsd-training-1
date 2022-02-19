
// 23)Create a labelled break and write a simple logic and execute the program.


public class programmm23 {

	public static void main(String[] args) {
		int i=1;
		a:
		while(i<10)
		{
			if(i==5)
			{
				break a;// labelled break
			}
			System.out.println("i= "+i);
			i++;
		}
		System.out.println("Out of while loop");

	}

}
