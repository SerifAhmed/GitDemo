package JavaPrograms;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println(num+" is an Even number");
		}
		else {
			System.out.println(num+" is an Odd number");
		}
		scan.close();
	}
}
