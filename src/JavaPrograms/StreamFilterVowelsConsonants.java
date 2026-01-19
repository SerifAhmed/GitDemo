package JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class StreamFilterVowelsConsonants {

public static void main(String[] args) {

        Character[] arr = {'a','r','g','e','i','y'};
        List<Character> letters = Arrays.asList(arr);

        System.out.println("Vowels:");
        letters.stream()
               .filter(ch -> ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
               .forEach(ch -> System.out.print(ch + " "));

        System.out.println();
        System.out.println("Consonants:");
        letters.stream()
               .filter(ch -> !(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
               .forEach(ch -> System.out.print(ch + " "));
    }
}

