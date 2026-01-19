package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters1 {

	 public static void main(String[] args) {
	        
	        String str = "Automation testing";
	        str=str.toLowerCase();
	        // Create a HashMap to store characters and their counts
	        Map<Character, Integer> countMap = new HashMap<>();
	        
	        // Loop through each character in the string
	        for (char c : str.toCharArray()) {
	            // Increase the count for each character
	        	countMap.put(c, countMap.getOrDefault(c, 0) + 1);
	        }
	        
	        System.out.println("Duplicate characters:");
	        
	        // Loop through map to print only characters with count > 1
	        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " = " + entry.getValue());
	            }
	        }
	    }
}


/*
--- PROGRAM EXPLANATION ---
Goal:
To find and print duplicate characters from a given string.

Step-by-step logic:

1️ We take a string: "Automation testing"

2️ We create a HashMap:
    - Key   → Each character in the string
    - Value → Number of times that character appears

3️ Convert string into a character array using:
       str.toCharArray()
   Then loop through each character one by one.

4️ For each character:
       charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
    - If character is NOT present in map → it adds with count = 1
    - If character is already present → it increases its count by +1

5️ After counting all characters:
    We loop through all map entries

6️ If a character count > 1:
       That character is a duplicate → Print it

💡 Why HashMap?
- It helps store characters along with how many times they appear.
- Easily allows checking which characters repeat.

🎯 Simple understanding:
- Count characters
- Print only those which appear more than once
 */
