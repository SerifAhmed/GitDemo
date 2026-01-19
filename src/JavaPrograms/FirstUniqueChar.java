package JavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
	
	public static void main(String[] args) {
        String str = "swissw";

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Step 1: Count occurrences of characters
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find first character with count 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated: " + entry.getKey());
                break;
            }
        }
    }
}

/*
| Step                           								| What happens                              						| Why we do it                                       								 |
| -------------------------------					| ----------------------------------------- 			| ---------------------------------------------------				 |
| 1️ Convert string to characters 				| `str.toCharArray()`                       							| Loop through each character                       						 |
| 2️ Store count in map           					| `map.put(c, map.getOrDefault(c, 0) + 1)`  		| Keep track of how many times each character appears  |
| 3️ Use **LinkedHashMap**        				| Stores character counts in original order 		| So we can detect the *first* unique character       			 |
| 4️ Loop through map entries     				| Check value of each entry                 					| If count = 1 → first non-repeated character         			 |

Why LinkedHashMap?
✔ Preserves insertion order
❌ HashMap does not
→ So we find the first non-repeated character correctly
 */
