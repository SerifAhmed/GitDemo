package Constructor;

public class constructorDemo {

	public constructorDemo() {
		
		System.out.println("I am in the contructor");
	}
	
	public void getData() {
		
		System.out.println("I am in the method");
	}
	
	
	public static void main(String[] args) {
		
		constructorDemo cd = new constructorDemo();

	}

}


/*
Constructor name should be same as class name
Will have no return value
Whenever we create a object, Constructor is called
Compiler will call implicit constructor if we do not define any constructor

Can constructors be overloaded? ✅ Yes. You can have multiple constructors with different parameter lists.

Can constructors be overridden? ❌ No. They are not inherited.

Can constructors be private? ✅ Yes — often used in Singleton Pattern.
*/