

interface Dogs {
		
		void bark();
		void run();
}

public class interfaceSample implements Dogs {

	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interfaceSample ex = new interfaceSample();
		ex.bark();
		ex.run();
	}
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dog fighting each other!");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Dog is jumping");
	}

}
