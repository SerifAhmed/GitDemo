package JavaPrograms;

public class ReverseWordsInString {
	
	public static void main(String[] args) {

        String sentence = "I am Working in Mphasis";

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Reverse each word
        for (String w : words) {
            String rev = new StringBuilder(w).reverse().toString();
            System.out.print(rev + " ");
        }
    }
}

/*
| Step| Code                     				| Meaning                                                 									|
| ----| ------------------------ 		| ------------------------------------------------------- 		 	|
| 1️    | `sentence.split(" ")`    			| Split the sentence into words wherever there is a space	|
| 2️    | `for (String w : words)` 		| Loop through each word in the array                     				|
| 3️    | `new StringBuilder(w)`   		| Convert word into StringBuilder to use reverse()        		|
| 4️    | `.reverse()`             				| Reverse that specific word                              						|
| 5️    | `.toString()`            				| Convert back to normal String                           					|
| 6️    | `System.out.print()`     		| Print reversed words in the same order                  				|

*/