package stringrelatedprograms;
import java.util.*;

public class DuplicatesInAStringAndRemove {

	public static void main(String[] args) {
		
		String str="abcabcabcD";
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		StringBuffer sb=new StringBuffer();
		
		
		for(int i=0;i<str.length();i++) {
			if(hmap.containsKey(str.charAt(i))) {
				hmap.put(str.charAt(i), hmap.get(str.charAt(i))+1);
			}
			else {
				hmap.put(str.charAt(i), 1);
				sb.append(str.charAt(i));
				
			}
			
			
			
			
			
		}
		
		System.out.println("Count of each duplicates in a string: "+hmap);
		System.out.println("After removing the duplicates in a String:"+sb);
		
		
		
		
		
		

	}

}
