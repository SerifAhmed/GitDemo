package JavaPrograms;

public class ReverseWholeString2 {
	
	public static void main(String[] args) {

        String str = "I am Working in Mphasis";
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        System.out.println("Reversed String: " + sb.toString());
    }
}

/*
for (int i = str.length() - 1; i >= 0; i--)
	str.length() → total number of characters
	-1 because index starts from 0
	Loop starts from last character
	Loop moves backwards
	
str.charAt(i)
	Fetches one character at index i
	Starting from the end
	
sb.append(str.charAt(i));
	Adds each character to sb
	Builds the reversed string step by step

sb.toString());
	toString() converts StringBuilder → String
	Prints the final reversed output
	Printing sb works because println() internally calls toString(), but explicit conversion is needed when assigning or returning a String.
*/