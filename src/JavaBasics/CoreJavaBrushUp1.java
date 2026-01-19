package JavaBasics;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum + " is the value stored in the myNum variable");
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(myCard);
		
		//Arrays -

		int[] arr = new int[5];// 5, 10
		arr[0] = 1;
		arr[1] = 2;
		arr[2]= 4;
		arr[3]= 5;
		arr[4]= 6;
		
		System.out.println("1st array length is: "+arr.length);
		
		int[] arr2 = {1,2,4,5,6};
		System.out.println("2nd array length is: "+arr2.length);
		
		//for loop arr.length - 5

		for(int i = 0; i< arr.length; i++) //4
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------");
		
		for (int i =0;i<arr2.length; i++)

		{

		System.out.println(arr2[i]);

		}
		
		System.out.println("---------------");
		
		String[] name = {"rahul", "shetty", "selenium"};
		System.out.println("3rd array length is: "+name.length);
		for(int i =0; i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("---------------");
		
		for( String s: name)
		{
			System.out.println(s);
		}

		System.out.println("---------------");
		
		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		for (int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]+" is a multiple of 2");
				break;
			}
				else
			{
				System.out.println(ar[i]+" is not a multiple of 2");
			}
		}
		
		System.out.println("---------------");
		
		// Create an array with 5 numbers
        double[] numbers = {10.5, 20, 30.75, 40, 50.25};
        
        // Print first element
        System.out.println("First element: " + numbers[0]);
        
        // Print last element
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        
        // Print elements in reverse order
        System.out.println("Elements in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
		

	}

}
