package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters2 {
	
	public static void main(String[] args) {

        String str = "java selenium";

        // Create a HashMap to store character as key and count as value
        Map<Character, Integer> countMap = new HashMap<>();

        // Loop through each character in the string
        for (char c : str.toCharArray()) {
        	
        	if (c == ' ') {
                continue; // skip space
            }

            // Update count of each character
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Print the full character count map
        System.out.println("Character counts: " + countMap);
    }
}

/*entrySet() is used only when we want to iterate over the map and process each key-value pair individually. 
Since here we directly print the map, entrySet() is not required.*/
