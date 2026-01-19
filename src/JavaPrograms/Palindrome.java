package JavaPrograms;

import java.util.Scanner;
public class Palindrome {
	
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		str=scan.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println(str+" is a Palindrome");
		}
		else {
			System.out.println(str+" is not Palindrome");
		}
		scan.close();
	}
}

//A Palindrome is a string that reads the same forward and backward.