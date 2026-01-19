package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class VowelsConsonantsPresent {

    public static void main(String[] args) {

        String str = "Serifuddin Ahmed Hazarika";
        str = str.toLowerCase();

        Map<Character, Integer> vowels = new HashMap<>();
        Map<Character, Integer> consonants = new HashMap<>();

        for (char ch : str.toCharArray()) {

            // skip spaces and non-letters
            if (!Character.isLetter(ch)) {
                continue;
            }

            // check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.put(ch, vowels.getOrDefault(ch, 0) + 1);
            }
            // consonant
            else {
                consonants.put(ch, consonants.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Vowels count: " + vowels);
        System.out.println("Consonants count: " + consonants);
    }
}

