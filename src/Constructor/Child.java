package Constructor;

public class Child extends Parent {

	Child() {
        super(); // calls Parent()
        System.out.println("Child constructor");
    }
	
	public static void main(String[] args) {
        Child c = new Child();
    }	
}


/*
Constructors cannot be overridden because they are not inherited by subclasses. 
However, you can overload constructors in the same class or call a parent’s constructor from a child’s constructor using super().
*/