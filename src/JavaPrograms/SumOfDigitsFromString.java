package JavaPrograms;

public class SumOfDigitsFromString {

    public static void main(String[] args) {

        String str = "abcd23";
        int sum = 0;

        for (char ch : str.toCharArray()) {

            if (Character.isDigit(ch)) {
                sum = sum + Character.getNumericValue(ch);
            }
        }

        System.out.println("Sum of digits: " + sum);
    }
}
