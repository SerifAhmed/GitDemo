package ThisDemo;

public class Demo2 {

	 int a; // instance variable

	    Demo2(int a) { // local variable 'a'
	        this.a = a; // 'this.a' refers to instance variable
	    }

	    void show() {
	        System.out.println(a);
	    }

	    public static void main(String[] args) {
	        Demo2 d = new Demo2(10);
	        d.show(); // Output: 10
	    }
	
}

/*
Program Explanation: Use of 'this' keyword to resolve variable name conflict.

1. int a;  
   → This is an instance variable (belongs to the object).

2. Demo2(int a)  
   → Constructor with a local variable 'a' (parameter).
   → Here, both instance variable and local variable have the same name 'a'.
   → 'this.a' refers to the instance variable.
   → The assignment this.a = a;  
     means: assign the value of local 'a' to the instance variable 'a'.

3. void show()  
   → Prints the value of the instance variable 'a'.

4. public static void main(String[] args)  
   → Creates an object: new Demo2(10);  
     Passes 10 to the constructor → this.a = 10.
   → Calls show() → prints the instance variable value 10.

Key Point:
- 'this' is used to differentiate between instance variables and local variables
  when they have the same name.
*/

