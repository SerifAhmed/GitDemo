package JavaPrograms;

public class MinMaxNumberInArray {
	
	 public static void main(String[] args) {

	        int[] arr = {5, 9, 2, 10, 3, 100, -1};

	        int min = arr[0]; // Assume the first element is smallest
	        int max = arr[0]; // Assume the first element is largest

	        for (int n : arr) {
	            if (n < min) {
	                min = n; // Update min
	            }
	            if (n > max) {
	                max = n; // Update max
	            }
	        }
	        System.out.println("Min: " + min + ", Max: " + max);
	    }
}

/*
We start by assuming the first number is both smallest & largest:
min = 5
max = 5

Compare each number from the array, one by one.
If smaller → update min
If larger → update max
*/