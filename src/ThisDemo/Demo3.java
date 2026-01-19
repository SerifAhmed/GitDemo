package ThisDemo;

public class Demo3 {
	
	 void method1() {
	        System.out.println("Method 1 called");
	    }

	    void method2() {
	        this.method1(); // Calls method1
	    }

	    public static void main(String[] args) {
	        Demo3 d3 = new Demo3();
	        d3.method2(); // Output: Method 1 called
	    }
}
