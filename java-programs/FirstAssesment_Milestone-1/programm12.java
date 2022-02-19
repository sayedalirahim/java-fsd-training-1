
// 12)Write a java program to implement method overloading

public class programm12 {

	public static void main(String[] args) {
		disp(2);
		disp(2,4,2);
		disp(10,5);
		disp();
	}
		static void disp(int a) {
			System.out.println(a*a);
		}
		
		static void disp(int a, int b,int c) {
			System.out.println(a+b+c);
		}

		static void disp(int a, int b) {
			System.out.println(a*b);
		}
		
		static void disp() {
			System.out.println("Null Value");
		}
}