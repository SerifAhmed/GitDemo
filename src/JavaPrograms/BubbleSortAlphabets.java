package JavaPrograms;

public class BubbleSortAlphabets {
	
	public static void main(String[] args) {
		System.out.println("BubbleSortAlphabets Program");
        char[] letters = {'a','c','d','b','e','f','i','j','g','h'};
        int n = letters.length;
        // Bubble sort logic
        for(int i = 0; i <n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
            	if(letters[j] > letters[j + 1]) {				//ascending order
            //	if(letters[j] < letters[j + 1]) {				//descending order
                    char temp = letters[j];
                    letters[j] = letters[j + 1];
                    letters[j + 1] = temp;
                }
            }
        }

        // Display sorted result
        System.out.print("Sorted letters: ");
        for(char c : letters){
            System.out.print(c + " ");
        }
    }
}

//In Java, characters (char) are actually stored as numbers internally using ASCII Value