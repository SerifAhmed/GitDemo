package JavaPrograms;

public class ArrangeCharacters {

	public static void main(String[] args){
        String str = "Auto123Mat!@#ion";
        String vowels="";
        String consonants="";
        String number="";
        String special="";
        
        str= str.toLowerCase();
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                number+=ch;
            }else if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels+=ch;
                }else{
                    consonants+=ch;
                }
            }else{
                special +=ch;
            }
        }
        
        System.out.println(vowels+" "+special+" "+number+" "+consonants);
    }
}
