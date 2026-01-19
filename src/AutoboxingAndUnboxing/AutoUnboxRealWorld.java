package AutoboxingAndUnboxing;

import java.util.ArrayList;

public class AutoUnboxRealWorld {
	
public static void main(String[] args) {
        
        // Create an ArrayList that stores Integer objects
        ArrayList<Integer> list = new ArrayList<>();

        // --- Autoboxing in action ---
        list.add(5);   // int 5 is automatically converted to Integer(5)
        list.add(10);  // int 10 -> Integer(10)
        list.add(15);

        System.out.println("ArrayList with Integers: " + list);

        // --- Unboxing in action ---
        int sum = 0;
        for (int num : list) {  // each Integer is automatically converted back to int
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
