package finalDemo;

public class Car extends Vehicle { 				// ❌ Error: Cannot inherit from final class
    void showBrand() {
        System.out.println("This is a car");
    }



    public static void main(String[] args) {
    	Car v = new Car();
        v.showType();
    }



	void showType() {
		// TODO Auto-generated method stub
		
	}

}

/*
Vehicle v = new Car();	✅ Yes	Upcasting (safe). Every Car is a Vehicle.
Car c = new Car();		✅ Yes	Normal object creation. Access everything in Car.
Car c = new Vehicle();	❌ No	Downcasting without check is unsafe. Not every Vehicle is a Car.
 */
