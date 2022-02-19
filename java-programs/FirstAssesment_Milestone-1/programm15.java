
// 15)Write a java program to implement multilevel inheritance.


public class programm15 {

	public static void main(String[] args) {
		Manager m=new Manager();
		m.Team();
		m.Name();
		m.Coach();
		}

	}

class Cricket
{  
	void Team(){
	System.out.println("ChennaiSuper kings");}  
	}  
class Player extends Cricket
	{  
		void Name()
	{
	System.out.println("Dhoniiii");
	}  
	}  
class Manager extends Player
	{  
		void Coach()
	{
	System.out.println("SachinTendulakr");
	}  
	}  
