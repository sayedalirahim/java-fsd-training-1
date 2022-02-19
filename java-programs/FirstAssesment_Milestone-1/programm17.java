
// 17)Write a java program to implement a constructor of the class, 
//to print the instance variables value with respect to different objects.


public class programm17 {
	
	String name; //instance variables
	int age;
	public programm17(String name, int age)
	{
		this.name = name;  
		this.age = age;
	}
			
		public String getName()
		{
			return name;
		}
		 
		public int getAge()
		{
			return age;
		}

	public static void main(String[] args) {
		programm17 s1 = new programm17("John",24); 
		programm17 s2 = new programm17("Ravi",50); 
		
		System.out.println("The name of student 1: "+s1.getName());
		System.out.println("The age of student 2: "+s2.getAge());
	}

}
