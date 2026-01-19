package JavaBasics;

public class exceptionsDemo2 {

    public static void main(String[] args) {

        try {
            int arr[] = new int[5];
            System.out.println(arr[7]); // will throw ArrayIndexOutOfBoundsException
            
            int arr2[] = new int[51];
            System.out.println(arr2[71]);
        } 
        catch (IndexOutOfBoundsException ie) {
            System.out.println("I catch Index Out of Bound Exceptions: "+ie);
        }

        
        
        System.out.println("Hello World"); // this should always print
    }
}
