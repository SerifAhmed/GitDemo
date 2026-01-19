package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class VowelConsonantCount {

    public static void main(String[] args) {

        String str = "Serifuddin Ahmed Hazarika";
        str = str.toLowerCase();

        Map<String, Integer> countMap = new HashMap<>();
        countMap.put("Vowels", 0);
        countMap.put("Consonants", 0);

        for (char ch : str.toCharArray()) {
            // skip spaces
            if (ch == ' ') {
                continue;
            }
            // check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countMap.put("Vowels", countMap.get("Vowels") + 1);	
            } 
            // consonant
            else {
                countMap.put("Consonants", countMap.get("Consonants") + 1);
            }
        }
        System.out.println(countMap);
    }
}

//countMap.get("Vowels"): This fetches the current value of "Vowels" from the map
//countMap.get("Vowels") + 1: We are incrementing that value.
