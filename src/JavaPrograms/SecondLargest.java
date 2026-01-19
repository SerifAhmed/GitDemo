package JavaPrograms;

public class SecondLargest {
	
	// Method to find the second largest number in an array
    static int secondLargest(int[] a) {

        int max1, max2;

        // Step 1: Initialize max1 and max2 from first two elements
        if (a[0] > a[1]) {
            max1 = a[0];
            max2 = a[1];
        } else {
            max1 = a[1];
            max2 = a[0];
        }

        // Step 2: Loop through remaining elements
        for (int i = 2; i < a.length; i++) {

            if (a[i] > max1) {         // If new largest number found
                max2 = max1;
                max1 = a[i];
            }
            else if (a[i] > max2) {    // If number is second largest
                max2 = a[i];
            }
        }

        return max2;
    }

    public static void main(String[] args) {

        int[] arr = {20, 42, 6, 25, 30, 88};

        System.out.println("Second Largest Number: " + secondLargest(arr));
    }
}
