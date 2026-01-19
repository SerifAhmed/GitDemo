package finalDemo;

public class Child extends Parent {
    // ❌ Error: Cannot override the final method
    /*
	void display() { 
    	System.out.println("Trying to override"); 
    }
    */
	
	void display(String msg) {
        System.out.println("Child says: " + msg);
    }
    
    public static void main(String[] args) {
    	 Child c = new Child();
         c.display();              // Calls Parent's final method
         c.display("Hello Java");  // Calls Child's overloaded method
    }
}

/*
Method Overriding-->
Happens when child class defines a method with the same name, same parameters, and same return type as the parent.
Example:

class Parent {
    void show() {}
}
class Child extends Parent {
    void show() {}   // ✅ this is overriding
}

Method Overloading-->
Happens when you define another method with the same name but different parameters (different number or type).
Example:

class Child {
    void display() {}            // one version
    void display(String msg) {}  // another version
}

This is NOT overriding, it’s just creating another version of the method (same name, different parameters).
Overloading is allowed even if the parent has a final method. ✅

c.display();
Compiler checks: Does Child have a display() method with no parameters?
Answer: ❌ No, Child only has display(String msg).
Then it looks into the Parent class.
Parent has final void display() → ✅ found.
So c.display(); calls Parent's final method

c.display("Hello Java");
Compiler checks: Does Child have display(String)?
Answer: ✅ Yes.
So this one calls Child’s overloaded method
*/