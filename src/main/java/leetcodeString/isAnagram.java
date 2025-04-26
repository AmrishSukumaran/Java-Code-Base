package leetcodeString;

import java.util.Arrays;

public class isAnagram {

	
	public static boolean isAnagram(String input1,String input2) {
		
		int n1=input1.length();
		int n2=input2.length();
		
		if(n1!=n2) {
			return false;
		}else {
		char[] ch1=input1.toLowerCase().toCharArray();
		char[] ch2=input2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean status=Arrays.equals(ch1, ch2);
		if(status) {
			return true;
		}
		else {
			return false;
		}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean stat=isAnagram("stop","post");
	System.out.print(stat);
	}

}
