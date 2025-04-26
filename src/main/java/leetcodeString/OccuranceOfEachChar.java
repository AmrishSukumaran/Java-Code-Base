package leetcodeString;

import java.util.*;

public class OccuranceOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Amrishashmra";
		str=str.toLowerCase();
		char[] charArray=str.toCharArray();
		
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		
		for(char ch:charArray) {
			if(hmap.containsKey(ch)) {
			
			hmap.put(ch, hmap.get(ch)+1);
			
			
		}else {
			hmap.put(ch, 1);
		}
			
		}
		
System.out.println(hmap);
	}

}
