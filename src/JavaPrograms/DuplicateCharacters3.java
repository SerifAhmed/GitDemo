package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters3 {

	public static void main(String[] args) {

        char[] ch = {'a','a','c','v','r','g','g','b'};

        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : ch) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " 
                                   + entry.getValue() + " times repeated");
            }
        }
    }
}