

	abstract class Cat {
		
	    String name = "Blue";
		public void type() {
			System.out.println("Indian Cat");
			
		}
		public abstract void run();
		public abstract void sound();
	}


	class NewCat extends Cat {
		
		public void run() {
			System.out.println("Cat is jumping");
		}
		
		public void sound() {
			System.out.println("Cat fighting each other!");
		}
	}

	public class abstractMethod {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat c = new NewCat();
		c.type();
		c.run();
		c.sound();

	}

}
