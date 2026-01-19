package JavaBasics;

public class DataTypes {

	public static void main(String[] args) {
		
		int num1=5;
		System.out.println(num1);
		
		int num2=99999;
		System.out.println(num2);
		
		//float num3=1.2; //error because by default it is a double value
		float num3=1.2f;
		System.out.println(num3);
		
		double num4=2.6;
		System.out.println(num4);
		
		char letter1='s';
		System.out.println(letter1);
		
		boolean condition=true;
		System.out.println(condition);
		
		//literals, these are the values that we assign to  variables
		
		char letter = 'a';
		System.out.println("Original letter: "+letter);
		letter++;
		System.out.println("After increment: "+letter);
		
		long num5=10000000000l;
		System.out.println(num5);
		long num6=1000_000_000_000l;
		System.out.println(num6);
		
		byte num7=21;
		System.out.println(num7);
		
		//byte to int conversion
		byte b = 7;
		int i = 12;
		i=b;
		System.out.println("b value is: "+b+" && i value is: "+i);
		// byte b = 7  → store 7 in b
		// int i = 12  → store 12 in i
		// i = b       → copy value of b (7) into i, replacing 12
		// Now b = 7, i = 7 → both print as 7

		
		//int to byte conversion
		//b=i;  //like this not possible, we need to do it explicitly which is called CASTING
		//System.out.println("b value is: "+b+" && i value is: "+i);
		
		//int to byte conversion
		byte b1 = 7;
		int i1 = 1222;
		b1=(byte)i1;
		System.out.println("b1 value is: "+b1+" && i1 value is: "+i1);
		

	}

}

/*
==============================
 JAVA TYPE CASTING REFERENCE
==============================

1) WHAT IS CASTING?
   - Casting = Converting a value from one data type to another.
   - Two types in Java:
     a) Implicit Casting (Widening) → done automatically by compiler
     b) Explicit Casting (Narrowing) → done manually by programmer

------------------------------------------------
2) IMPLICIT CASTING (WIDENING CONVERSION)
   - Smaller type → Larger type
   - No data loss, no extra syntax needed.
   - byte → short → int → long → float → double

   Example:
   byte b = 7;
   int i = b; // byte → int (automatic)
   System.out.println(i); // 7

------------------------------------------------
3) EXPLICIT CASTING (NARROWING CONVERSION)
   - Larger type → Smaller type
   - Possible data loss, must write cast manually.
   - double → float → long → int → short → byte

   Example:
   int x = 130;
   byte y = (byte) x; // int → byte
   // Overflow happens here because byte range is -128 to 127
   System.out.println(y); // -126


4) TIP:
   - Widening = Automatic (no cast needed)
   - Narrowing = Manual (must write cast)
   - Overflow/precision loss can happen in narrowing
*/
