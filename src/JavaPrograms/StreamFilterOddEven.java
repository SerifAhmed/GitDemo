package JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class StreamFilterOddEven {
	
	 public static void main(String[] args) {
	        
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
	        
	        System.out.println("EvenNumbers:");
	        numbers.stream()
	            .filter(n -> n % 2 == 0)     // Lambda that returns only even numbers
	            .forEach(n -> System.out.print(n+" ")); // Lambda print
	       
	        System.out.println("");
	        System.out.println("OddNumbers:");
	        numbers.stream()
            .filter(n -> n % 2 != 0)     // Lambda that returns only even numbers
            .forEach(n -> System.out.print(n+" ")); // Lambda print
	    }
}
