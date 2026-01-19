package finalDemo;

public class Dad {
	
	final void display() {
        System.out.println("Final method in Dad");
    }
    // Overloading allowed
    void display(String msg) {
        System.out.println("Overloaded method: " + msg);
    }
    
    public static void main(String[] args) {
        Dad d = new Dad();
        d.display();
        d.display("Hello Java");
    }
}


//Yes, a final method in Java can be overloaded, but it cannot be overridden.