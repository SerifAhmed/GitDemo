package AutoboxingAndUnboxing;

public class AutoUnboxDemo {
	
public static void main(String[] args) {
        
        // --- Autoboxing: primitive -> Wrapper object ---
        int a = 10;
        Integer obj = a;   // Java automatically converts int to Integer
        System.out.println("Autoboxing: int to Integer -> " + obj);

        // --- Unboxing: Wrapper object -> primitive ---
        Integer b = 20;
        int num = b;       // Java automatically converts Integer to int
        System.out.println("Unboxing: Integer to int -> " + num);
    }
}

