package JavaPrograms;

public class ReverseWholeString {
	
	public static void main(String[] args) {

        String str = "I am Working in Mphasis";
        String reversed = "";

        // Loop backward
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println(reversed);
    }
}
