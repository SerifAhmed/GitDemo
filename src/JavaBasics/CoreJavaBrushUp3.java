package JavaBasics;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
		//String is an object and there are 2 ways to create string object
		//1st method: String literal
		String s = "Serif is learning JAVA";  //this creates one object in Java memory space, object 's' will store whatever we declare
		String s1 = "Serif is learning JAVA";
		/*first JAVA will check whether the content is same or not if its same JAVA will not create 's1' object, instead 's1' will be 
		point to 's' object only*/
		//if text is same no matter how many string variables we create in backend only one object will be created 

		//2nd method: with 'new' keyword
		String s2 = new String("Welcome"); //'s2' object we have created & in that we are storing 'Welcome'
		String s3 = new String("Welcome"); //'s3' object will also be created which will store 'Welcome'
		//no matter content is same every time it will create new object
		
		String str = "Let's do some coding";
		String[] splittedString = str.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		System.out.println(splittedString[3]);
		
		System.out.println("------------");
		
		String[] splittedStr = str.split("some");
		System.out.println(splittedStr[0]);
		System.out.println(splittedStr[1]);
		System.out.println(splittedStr[1].trim());
		
		System.out.println("------------");
		
		for(int i=0; i<str.length(); i++)
		{
			System.out.println(str.charAt(i)); 
		}
		
		System.out.println("------------");
		
		System.out.println("Length of str is: "+str.length());
		
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.println(str.charAt(i));
		}
		
		System.out.println("------------");
		
		String str1 = "I am Serif";

        // Using StringBuilder's reverse method
        String reversed = new StringBuilder(str1).reverse().toString();

        System.out.println("Original: " + str1);
        System.out.println("Reversed: " + reversed);
        
        System.out.println("------------");
        
        String str2 = "I am Learning Java";

        // Split string into words
        String[] words = str2.split(" ");

        // Reverse the words
        String reversed1 = "";
        for (int i = words.length - 1; i >= 0; i--) {
        	reversed1 += words[i] + " ";
        }

        // Trim extra space at the end
        reversed1 = reversed1.trim();

        System.out.println("Original: " + str2);
        System.out.println("Reversed words: " + reversed1);
	}

}
