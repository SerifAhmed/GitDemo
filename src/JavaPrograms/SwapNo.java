package JavaPrograms;

import java.util.Scanner;

public class SwapNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		System.out.print("Enter the first number: ");
		a=scan.nextInt();
		System.out.print("Enter the second number: ");
		b=scan.nextInt();
		System.out.println("Before swapping: a= "+a+" and b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: a= "+a+" and b= "+b);
		scan.close();
	}
}
