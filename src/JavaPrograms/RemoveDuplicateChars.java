package JavaPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {

    public static void main(String[] args) {
        char[] ch = {'a','a','c','v','r','g','g','b'};
        Set<Character> set = new LinkedHashSet<>();
        for (char c : ch) {
            set.add(c);
        }
        System.out.println("After removing duplicates: " + set);
    }
}
/*
		char[] ch = {'a','d','d','s','a','v'};
        for (int i = 0; i < ch.length; i++) {
            int j;
            // check if ch[i] appeared earlier
            for (j = 0; j < i; j++) {
                if (ch[i] == ch[j]) {
                    break;
                }
            }
            // if j == i, it means NOT found earlier
            if (j == i) {
                System.out.print(ch[i] + " ");
            }
        }
*/