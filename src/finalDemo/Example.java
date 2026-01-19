package finalDemo;

public class Example {
	
	    public static void main(String[] args) {
	        int SPEED_LIMIT = 90;
	        
	        System.out.println("Speed limit is: " + SPEED_LIMIT);
	        
	        // ❌ Error: cannot assign a value to final variable
	        SPEED_LIMIT = 120;
	    }
}


//👉 A final variable becomes a constant. Once assigned, it cannot be changed.