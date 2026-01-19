package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatingChar {

    public static void main(String[] args) {

        String str = "automation testing";
        str = str.replace(" ", "").toLowerCase();
        Map<Character, Integer> countMap = new HashMap<>();
        // Step 1: Count frequency
        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        int firstMax = 0;
        int secondMax = 0;
        char firstChar = '\0';			//'\0' = empty character, it means “no character currently stored”
        char secondChar = '\0';
        // Step 2 & 3: Find first and second highest frequency
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();           
            if (count > firstMax) {
                secondMax = firstMax;
                secondChar = firstChar;
                firstMax = count;
                firstChar = entry.getKey();
            } else if (count > secondMax && count != firstMax) {
                secondMax = count;
                secondChar = entry.getKey();
            }
        }
        // Step 4: Print result
        System.out.println("Second most repeating character: "
                + secondChar + " = " + secondMax + " times");      
        System.out.println("Most repeating character: "
                + firstChar + " = " + firstMax + " times");
    }
}
