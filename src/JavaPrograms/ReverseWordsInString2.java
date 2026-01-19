package JavaPrograms;

public class ReverseWordsInString2 {
	
	public static void main(String[] args) {

        String sentence = "I am Working in Mphasis";

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Reverse each word manually
        for (String w : words) {
            String rev = "";   // holds reversed word
            for (int i = w.length() - 1; i >= 0; i--) {
                rev = rev + w.charAt(i);
            }
            System.out.print(rev + " ");
        }
    }
}