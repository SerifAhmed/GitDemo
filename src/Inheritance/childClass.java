package Inheritance;

public class childClass extends parentClass {
	
	public void Logo() {
		System.out.println("Logo method of Child Class implementation");
	}
	
	public void Colour() {
		System.out.println(colour + " is the colour of our new model Cars");
	}
	
	public static void main(String[] args) {
		childClass cc = new childClass();
		cc.Colour();
		cc.Gear();
		cc.Engine();
		cc.Brakes();
		cc.Logo();

	}

}
