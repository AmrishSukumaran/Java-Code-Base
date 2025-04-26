package stringrelatedprograms;

import java.util.Arrays;

public class checkAnagram {

	public static void main(String[] args) {
		String str1="listen";
		String str2="silent";
		
		char[] charArray1 = str1.toCharArray();
		
		char[] charArray2=str2.toCharArray();
		
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1,charArray2)) {
			System.out.println("Both Strings are anagrams");
		}
		else {
			System.out.println("Both Strings are not anagrams");
		}
		
		
		
		
	}

}
