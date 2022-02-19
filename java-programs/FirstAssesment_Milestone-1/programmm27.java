

// 27)Create an inheritance class. (Super class as Vehicle and 2 subclasses Car 
// and Bike and inherit the Vehicle class methods)



public class programmm27 {

	public static void main(String[] args) {
		Car obj_B = new Car();
        obj_B.run();
        obj_B.run();
 
        Bike obj_C = new Bike();
        obj_C.run();
        obj_C.run();
 
	}
       
	}

class Vehicle {
    public void run() { 
    	System.out.println("Vehicle running at 80 km/h"); 
    	}
}
 
class Car extends Vehicle{
    public void run() {
    	System.out.println("Car running at 60 km/h"); 
    	}
}
 
class Bike extends Vehicle {
    public void print_C() { 
    	System.out.println("Bike running at 60 km/h"); 
    	}
}
 
