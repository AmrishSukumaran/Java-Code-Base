package stringrelatedprograms;

public class FirstNonRepeatingCharacterInaString {

	public static void main(String[] args) {
		String str="swiss";
		char[] charArray = str.toCharArray();
		
		for(Character ch:charArray) {
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println("First non repeatng character in string is :"+ch);
			}
		}
		
		
		

	}

}
