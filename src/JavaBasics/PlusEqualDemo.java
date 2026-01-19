package JavaBasics;

public class PlusEqualDemo {

	public static void main(String[] args) {
		
		// Example with numbers
        int num = 5;
        System.out.println("Initial num: " + num);

        num += 3; // same as num = num + 3;
        System.out.println("After num += 3: " + num);

        // Example with strings
        String text = "Hello";
        System.out.println("\nInitial text: " + text);

        text += " World"; // same as text = text + " World";
        System.out.println("After text += \" World\": " + text);

        text += "!"; // adds more
        System.out.println("After text += \"!\": " + text);

	}

}
