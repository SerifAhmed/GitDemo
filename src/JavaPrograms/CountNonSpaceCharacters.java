package JavaPrograms;

public class CountNonSpaceCharacters {

    public static void main(String[] args) {

        String str = "Serifuddin Ahmed Hazarika";
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {   // ignore spaces
                count++;
            }
        }
        System.out.println("Non-space character count: " + count);
    }
}

