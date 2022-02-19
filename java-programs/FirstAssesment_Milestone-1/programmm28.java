
// 28)Depict programmatically the Method overloading and Method overriding concepts.

public class programmm28 extends SolarSystem{

	public static void main(String[] args) {
		programmm28 obj1= new programmm28();
		obj1.rotate("Earth"); // method overriding
		stop(); //method overloading
		int a = stop(5);
		System.out.println(a);
		stop("ajith",33);		

	}

static void stop()
{
	System.out.println("Stops");
}

static int stop(int x)
{
	return x*2;
}
static void stop(String str,int y)
{
	System.out.println("I am "+str+" "+y);
}

}
class SolarSystem
{
void rotate(String name)
{
	System.out.println(name +" is Rotating");
}
}
