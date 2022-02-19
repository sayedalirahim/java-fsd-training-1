
// 14)Write a java program to implement Hybrid Inheritance

public class programm14 extends Tigers {

	public static void main(String[] args) {
		 programm14 obj2  = new  programm14();
			obj2.running();
			obj2.cry();
	}
}

class Animals
{
	void running() 
	{
		System.out.println("All animals are staying in forest");
	}
}

class Lions extends Animals
{
	void bark() 
	{
		System.out.println("Lions laughing");
	}
}

class Tigers extends Animals
{
	void cry()
	{
		System.out.println("tigers are eating");
	}
}
	
	
