package AccessModifiers;

public class A {
	
	private int d=100;
	
	private void show() {
		System.out.println("Private method");
	}
	
	public void accessPrivate() {
		System.out.println(d);
		show();
	}
}
	

	

