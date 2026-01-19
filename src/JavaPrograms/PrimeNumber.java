package JavaPrograms;

public class PrimeNumber {

	public static void main(String[] args){
        int number=11;
        if(isPrime(number)){
            System.out.println(number+" is a Prime Number");
        }
        else{
            System.out.println(number+" is not a Prime Number");
        }
    }
    
    public static boolean isPrime(int num){
        int count =0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        return count==2;    // true → prime, false → not prime
    }
    
}

/*
count == 2 → This is comparison
It checks the value of count.
If count is 2 → true
If count is not 2 → false
This matches your method return type boolean.
	Prime number → exactly 2 divisors
	If count is: 2 → prime → true
	anything else → not prime → false

count = 2 → This is assignment
It sets the value of count to 2.
You are changing the value, not checking it.
 */
