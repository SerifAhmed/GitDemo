package ThisDemo;

public class Demo4 {
	
	 Demo4() {
        this(5); // Calls parameterized constructor
        System.out.println("Default constructor");
     }

     Demo4(int x) {
        System.out.println("Parameterized constructor: " + x);
     }

     public static void main(String[] args) {
        Demo4 d = new Demo4();
     }
}

/*
Program Explanation: Using 'this()' to call another constructor (Constructor Chaining).

1. Demo4()  → Default constructor.
   - Calls parameterized constructor using 'this(5)'.
   - 'this(5)' must be the first statement in the constructor.
   - After parameterized constructor executes, it prints "Default constructor".

2. Demo4(int x)  → Parameterized constructor.
   - Prints: "Parameterized constructor: " + x.

3. main() method:
   - Creates a new Demo4() object.
   - Execution flow:
        → Default constructor called.
        → Inside default constructor: this(5) → calls parameterized constructor.
        → Parameterized constructor executes and prints:
             "Parameterized constructor: 5"
        → Control returns to default constructor.
        → Prints: "Default constructor".

Output:
Parameterized constructor: 5
Default constructor

Key Points:
- 'this()' is used to call another constructor in the same class.
- It must be the first statement in the constructor.
- Constructor chaining helps avoid code duplication and improves maintainability.
*/
