package JavaPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        String str = "automation";
        Set<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        System.out.println(set);
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }
        System.out.println("After removing duplicates: " + result);
    }
}
/*
  		String str = "automation";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // check if character already exists in result
            if (result.indexOf(ch) == -1) {						//result.indexOf(ch)->Returns -1 → character NOT present
                result += ch;
            }
        }
        System.out.println("After removing duplicates: " + result);
 */
