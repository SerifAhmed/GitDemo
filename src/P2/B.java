package P2;
import P1.A;

public class B extends A {
	
	void test() {
		show();
	}
	
	public static void main(String[] args) {
		B obj = new B();
		obj.test();
		
		A obj2 = new A();
		obj2.show();
	}
}
