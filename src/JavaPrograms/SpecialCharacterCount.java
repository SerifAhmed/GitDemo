package JavaPrograms;

public class SpecialCharacterCount {
	public static void main(String[] args){
		
		String str="Auto!@&%#mation)$(Testin9";
		int count=0;
		System.out.print("Special Characters: ");
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!Character.isLetterOrDigit(ch)) {
				System.out.print(ch+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Count of special characters: "+count);
	}
}
