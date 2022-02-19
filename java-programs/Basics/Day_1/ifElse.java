import java.util.Scanner;
public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Two Numbers (Press Enter after each):");
		   int num1,num2;
		   num1 = sc.nextInt();
           num2 = sc.nextInt();
           
           if (num1> num2) {
        	   System.out.println("num1 is greater"+ num1);
        	   
           }
           else {
        	   System.out.println("num2 is greater" +num2);
           }
	}
	
	

}
