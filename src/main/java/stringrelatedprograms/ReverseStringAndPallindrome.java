package stringrelatedprograms;

public class ReverseStringAndPallindrome {
	static String reverse = "";

	public static void reverse(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);

		}

	}

	public static void main(String[] args) {
		String str = "Amrish";

		reverse(str);
		System.out.println(reverse);
		
		checkPallindrome(str,reverse);

	}
	
	
	
public static void checkPallindrome(String reverse,String str) {
	
	
	if(str.equalsIgnoreCase(reverse)) {
		System.out.println("String pallindrome");
	}else {
		System.out.println("NOT a String pallindrome");
	}
	
}
	

}
