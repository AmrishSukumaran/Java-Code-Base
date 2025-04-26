package javaprograms;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sent="Amrish and Preethi are soulmates";
		
		String words[] = sent.split("\\s");
	    String reversedString = "";
	 
	    for (int i = 0; i < words.length; i++) 
	    {
	      String word = words[i];
	      String reverseWord = "";
	      for (int j = word.length() - 1; j >= 0; j--) {
	        reverseWord = reverseWord + word.charAt(j);
	      }
	      reversedString = reversedString + reverseWord + " ";
	    }
	 
	    // Displaying the string after reverse
	    System.out.print("Reversed string : " + reversedString);
	  }
}
