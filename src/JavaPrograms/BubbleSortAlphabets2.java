package JavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSortAlphabets2 {
		
	public static void main(String[] args) {

        Character[] letters = {'a','c','d','b','e','f','i','j','g','h'};

        List<Character> list = Arrays.asList(letters);
/*
        Collections.sort(list);   // ascending order
        System.out.println("Sorted letters: " + list);
        
        Collections.sort(list, Collections.reverseOrder());		//descending order
        System.out.println("Sorted letters: " + list);
   */     
        Collections.reverse(list);
        System.out.println("Sorted letters: " + list);
    }
}
