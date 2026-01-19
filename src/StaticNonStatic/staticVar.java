package StaticNonStatic;

public class staticVar {

	//instance variable
	String name;
	String city;
	int age;	
	static String country = "India"; //static variables are part of class not objects, so  they are called Class Variables
	int i=0;
	static int j=0; 
	static String continent;
	static int pincode;
	
	static {
		continent="Asia";
		pincode=781111;
	}
	
	staticVar(String name, String city, int age){
		this.name=name;
		this.city=city;
		this.age=age;
		System.out.println("Before: ");
		System.out.println("(instant variable) i: "+i);
		System.out.println("(static variable) j: "+j);
		i++;
		j++;
		System.out.println("After: ");
		System.out.println("(instant variable) i: "+i);
		System.out.println("(static variable) j: "+j);
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	public void getAddress() {
		System.out.println(city+", "+country);
	}
	
	public static void getCountryName() {
		System.out.println(country);
	}
	
	
	public static void getContinentPin() {
		System.out.println(continent+", "+pincode);
	}
	
	public static void main(String[] args) {
		
		staticVar obj1 = new staticVar("Serif","Tezpur",32);		//object we need to create always inside main method
		staticVar obj2 = new staticVar("Mohan","Bangalore",31);
		obj1.getName();
		obj1.getAddress();
		obj2.getName();
		obj2.getAddress();
		staticVar.getCountryName();
		staticVar.j=91;
		obj1.city="Kolkata";
		obj1.getAddress();
		staticVar.getContinentPin();
	}

}
