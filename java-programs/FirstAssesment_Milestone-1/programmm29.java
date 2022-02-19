
// 29)Create an abstract class and extend that class 
//and try to create the object of the abstract class in a program and execute.

	abstract class Cat {
		public void type() {
			System.out.println("Persian Cat");
			
		}
		public abstract void run();
		public abstract void sound();
	}
	class NewCat extends Cat {
		
		public void run() {
			System.out.println("Cat says hello");
		}
		
		public void sound() {
			System.out.println("Cat says hai");
		}
	}
	public class programmm29 {
	
		public static void main(String[] args) {
			Cat c = new NewCat();
			c.type();
			c.run();
			c.sound();
		}
		}
