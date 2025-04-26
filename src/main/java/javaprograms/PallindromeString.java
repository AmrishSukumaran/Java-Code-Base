package javaprograms;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="madam";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);
		
			
			
		}
		System.out.println(reverse);
		if(reverse.equalsIgnoreCase(reverse)) {
			
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not a pallindrome");
		}

	}
}


