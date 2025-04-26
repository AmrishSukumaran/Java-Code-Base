package leetcodeString;

public class ReverseString {
	
	public static String reverseString(String input) {
		String reverse="";
		
	for(int i=input.length()-1;i>=0;i--) {
		reverse=reverse+input.charAt(i);
	}
		return reverse;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String revStr=reverseString("Amrish");
		System.out.print(revStr);
		
	

	}

}
