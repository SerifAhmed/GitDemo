package ThisDemo;

public class Demo {

	int a = 10;		//Global variable
	
	public void getData() {
		int a = 5;		//Local variable
		int b = a+this.a;
		System.out.println("Local variable: "+a);
		System.out.println("Global variable: "+this.a);
		System.out.println("Sum: "+b);
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.getData();
	}

}
