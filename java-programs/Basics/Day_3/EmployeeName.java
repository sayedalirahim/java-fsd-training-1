import java.util.Scanner;

public class EmployeeName {
	
	public static int CalBonus(int salary, int year)
	{
		int bonus=0;
		if(year<=2017 && salary>30000)
		{
			bonus = (salary*22)/100;
		}
		else if(year<=2017 && salary<30000)
		{
			bonus = (salary*33)/100;
		}
		else if(year<=2012)
		{
			bonus = (salary*40)/100;
		}
		else if(year>2017 && salary<30000)
		{
			bonus = (salary*15)/100;
		}
		else if(year>2017 && salary>30000)
		{
			bonus = (salary*10)/100;
		}
		return bonus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String name = sc.next();
		System.out.println("Enter your salary: ");
		 
		int salary1 = sc.nextInt();
		
		
		
		System.out.println("Enter your year of joining: ");
		int yearr1 = sc.nextInt();
		int result = CalBonus(salary1,yearr1);
		
		System.out.println("The Loyality Bonus of "+name+" is "+result);
	}
	

}
