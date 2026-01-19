package JavaPrograms;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String str="Auto!@&%#mation)$(Testin9g";
		StringBuilder finalString = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				finalString.append(ch);
			}
		}
		System.out.println(finalString);
		
		String result="";
		for(int i=0;i<finalString.length();i++) {
			char c=finalString.charAt(i);
			if(Character.isLetter(c)) {
				result+=c;
			}
		}
		System.out.println(result);
	}
}
