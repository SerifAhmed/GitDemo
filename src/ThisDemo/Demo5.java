package ThisDemo;

public class Demo5 {
	
	// Default constructor
    Demo5() {
        this("Hello Serif"); // Calls parameterized constructor
        System.out.println("Default constructor");
    }

    // Parameterized constructor with String
    Demo5(String msg) {
        System.out.println("Parameterized constructor: " + msg);
    }

    public static void main(String[] args) {
        Demo5 d = new Demo5();
    }
}
