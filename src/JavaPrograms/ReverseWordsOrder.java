package JavaPrograms;

public class ReverseWordsOrder {
	
    public static void main(String[] args) {

        String str = "I am working in Mphasis";
        
        // Step 1: Split into words using space
        String[] words = str.split(" ");
        
        // Step 2: Print words in reverse order
        System.out.println("Reversed sentence:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
