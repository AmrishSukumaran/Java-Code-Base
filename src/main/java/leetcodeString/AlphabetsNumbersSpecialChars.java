package leetcodeString;
import java.util.*;
public class AlphabetsNumbersSpecialChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="B4C2A1";
		//StringBuffer alpha=new StringBuffer();
		//StringBuffer num=new StringBuffer();
		
		ArrayList<Character> alphabets=new ArrayList<Character>();
		ArrayList<Character> nums=new ArrayList<Character>();
		
//		for(int i=0;i<str.length();i++) {
//			if(Character.isAlphabetic(str.charAt(i))) {
//				//alpha.append(str.charAt(i));
//				alphabets.add(str.charAt(i));
//				
//			}
//			
//			else if(Character.isDigit(str.charAt(i))) {
//				//num.append(str.charAt(i));
//				nums.add((str.charAt(i)));
//			}
//			
//		}
		
		String alpha = str.replaceAll("[^a-zA-Z]", "");
		String nums1 = str.replaceAll("[^0-9]", "");
		
		
	List<String> asList = Arrays.asList(alpha);
	
	Collections.sort(asList);
		
		
		
		//Collections.sort(alpha);
	//	Collections.sort(nums);
		
		//System.out.println(alpha);
		//System.out.println(num);
		
		
		System.out.println(asList);
		System.out.println(nums1);
		
		
		
		
		
		
		
		
		

	}

}
