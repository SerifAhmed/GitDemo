package ThisDemo;

public class Demo6 {
	
	void display(Demo6 obj) {
        System.out.println("Method called with current object");
    }

    void call() {
        display(this); // 'this' = current object that is calling the method
    }

    public static void main(String[] args) {
    	Demo6 d = new Demo6(); // Step 1: Create object 'd'
        d.call();            // Step 2: Call 'call()' on 'd'
    }
}

/*
1. Program starts from main().
2. 'Demo6 d = new Demo6();'
   - Creates a new Demo6 object and stores it in variable 'd'.
3. 'd.call();'
   - Runs the call() method using object 'd'.
4. Inside call():
   - 'this' refers to the current object (in this case, 'd').
   - We pass 'this' to the display() method.
5. Inside display():
   - It prints "Method called with current object".
6. Output:
   Method called with current object

Key Idea:
'this' means "the current object running the method".
You can use 'this' to:
   - Refer to instance variables
   - Call other methods in the same object
   - Pass the current object to another method
*/