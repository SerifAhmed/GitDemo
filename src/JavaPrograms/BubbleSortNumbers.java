package JavaPrograms;

public class BubbleSortNumbers {
	
	void bubbleSort(int[] arr)
    {
        int n = arr.length;
      
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]) {			//ascending order
              //if (arr[j] < arr[j + 1]) {			//descending order
                  
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSortNumbers ob = new BubbleSortNumbers();
        int[]  a= { 9, 53, 64, 34, 25, 12 };
        
        ob.bubbleSort(a);
      
      	int n = a.length;
      
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
