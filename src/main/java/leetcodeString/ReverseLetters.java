package leetcodeString;

public class ReverseLetters {
	
	
	
	public static String reverseLetters(String str) {
		String temp="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			temp=ch+temp;
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String value=reverseLetters("ab-cd");
System.out.print(value);

		
		
		
		
		
		
	}

}
