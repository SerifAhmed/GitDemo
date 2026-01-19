package JavaPrograms;

import java.util.Arrays;

public class AnagramCheck {
	
	public static void main(String[] args) {
		//Anagram
		System.out.println("Anagram Program");
        String s1 = "listen";
        String s2 = "silent";

        // Convert both strings into character arrays
        char[] a = s1.toCharArray();	//['l', 'i', 's', 't', 'e', 'n']
        char[] b = s2.toCharArray();	//['s', 'i', 'l', 'e', 'n', 't']

        // Sort the character arrays alphabetically
        Arrays.sort(a);					//['e','i','l','n','s','t']
        Arrays.sort(b);					//['e','i','l','n','s','t']

        // Compare sorted arrays
        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}

/*
| Step                             									| What happens?                           									| Why important?                                                    						      |
| --------------------------------------------| --------------------------------------------------------| ------------------------------------------------------------------- |
| 1️ Convert strings to char arrays 				| `s1.toCharArray()` & `s2.toCharArray()` 						| Strings can't be sorted directly                                                       |
| 2️ Sort the arrays                							| `Arrays.sort()`                         											| If two strings are anagrams, their sorted forms will be identical |
| 3️ Compare arrays                                       | `Arrays.equals()`                                                               | Checks if every character matches in order                                    |
| 4️ Print result                                                | `"Anagram"` / `"Not Anagram"`                                    | Final conclusion                                                                                 |
*/