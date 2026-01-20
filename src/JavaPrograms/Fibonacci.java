package JavaPrograms;

import java.util.Scanner;

public class Fibonacci {
	
	 public static void main(String[] args){
		 System.out.println("Fibonacci");
	        int a=0, b=1, c, term;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the term: ");
	        term=scan.nextInt();
	        System.out.print("Fibonacci Series: ");
	        for(int i=1;i<=term;i++){
	            System.out.print(a+" ");
	            c=a+b;
	            a=b;
	            b=c;
	        }
	        scan.close();
	    }
}
