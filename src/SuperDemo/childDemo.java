package SuperDemo;

public class childDemo extends parentDemo {

	String name = "Selenium Automation Tool";
	
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am from child class Boss!!");
	}
	
	public childDemo() {
		super();		// this should be always at first line inside child class constructor
		System.out.println("Child class constructor");
		//super();
	}
	
	public static void main(String[] args) {
		childDemo cd = new childDemo();
		cd.getStringData();
		cd.getData();
	}

}
